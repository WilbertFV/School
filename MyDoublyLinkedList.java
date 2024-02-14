import java.util.Iterator;

public class MyDoublyLinkedList<E> implements MyList<E> {
    private Node<E> head, tail;
    private int size = 0; // Number of elements in the list

    public MyDoublyLinkedList() {
    }

    public MyDoublyLinkedList(E[] objects) {
        for (E object : objects) {
            add(object);
        }
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e); 
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = head;
        } else {
            head.next.previous = head;
        }
        size++;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void add(int index, E e) {
        if (index == 0) {
            addFirst(e);
        } else if (index >= size) {
            addLast(e);
        } else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<>(e);
            (current.next).next = temp;
            temp.previous = current.next;
            current.next.previous = current;
            size++;
        }
    }

    public E removeFirst() {
        if (size == 0) {
            return null;
        } else {
            E temp = head.element;
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            } else {
                head.previous = null;
            }
            return temp;
        }
    }

    public E removeLast() {
        if (size == 0) {
            return null;
        } else if (size == 1) {
            E temp = head.element;
            head = tail = null;
            size = 0;
            return temp;
        } else {
            E temp = tail.element;
            tail = tail.previous;
            tail.next = null;
            size--;
            return temp;
        }
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new DoublyLinkedListIterator();
    }

    private class DoublyLinkedListIterator implements Iterator<E> {
        private Node<E> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            E e = current.element;
            current = current.next;
            return e;
        }
    }

    protected static class Node<E> {
        E element;
        Node<E> next;
        Node<E> previous;

        public Node(E element) {
            this.element = element;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        Node<E> current = head;
        while (current != null) {
            result.append(current.element);
            current = current.next;
            if (current != null) {
                result.append(", ");
            }
        }

        return result.toString() + "]";
    }

    @Override
public E set(int index, E e) {
    if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    Node<E> current = head;
    for (int i = 0; i < index; i++) {
        current = current.next;
    }

    E oldElement = current.element;
    current.element = e;
    return oldElement;
}

@Override
public boolean contains(Object o) {
    Node<E> current = head;
    while (current != null) {
        if (o.equals(current.element)) {
            return true;
        }
        current = current.next;
    }
    return false;
}

@Override
public void clear() {
    head = tail = null;
    size = 0;
}

@Override
public int indexOf(Object e) {
    Node<E> current = head;
    for (int i = 0; i < size; i++) {
        if ((e == null && current.element == null) || (e != null && e.equals(current.element))) {
            return i;
        }
        current = current.next;
    }
    return -1;
}

@Override
public E remove(int index) {
    if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    } else if (index == 0) {
        return removeFirst();
    } else if (index == size - 1) {
        return removeLast();
    } else {
        Node<E> previous = head;
        for (int i = 1; i < index; i++) {
            previous = previous.next;
        }
        Node<E> current = previous.next;
        previous.next = current.next;
        if (current.next != null) {
            current.next.previous = previous;
        }
        size--;
        return current.element;
    }
}

@Override
public int lastIndexOf(E e) {
    int index = size - 1;
    Node<E> current = tail;
    while (current != null) {
        if ((e == null && current.element == null) || (e != null && e.equals(current.element))) {
            return index;
        }
        current = current.previous;
        index--;
    }
    return -1;
}

    public static void main(String[] args) {
        MyDoublyLinkedList<Integer> myLinkedList = new MyDoublyLinkedList<>();

        long begin, end, time;

        // Add 4 elements
        begin = System.nanoTime();
        for (int i = 1; i < 5; i++) {
            myLinkedList.add(i);
        }
        end = System.nanoTime();
        time = end - begin;
        System.out.println("Initial list: " + myLinkedList + ", Time to add elements: " + time + " nanoseconds");

        // Add 4 more in front of the list
        begin = System.nanoTime();
        for (int i = 1; i < 5; i++) {
            myLinkedList.addFirst(10 + i);
        }
        end = System.nanoTime();
        time = end - begin;
        System.out.println("List after adding at the beginning: " + myLinkedList + ", Time to add elements at the beginning: " + time + " nanoseconds");

        // Remove 3 last elements
        begin = System.nanoTime();
        for (int i = 0; i < 3; i++) {
            myLinkedList.removeLast();
        }
        end = System.nanoTime();
        time = end - begin;
        System.out.println("List after removal: " + myLinkedList + ", Time to remove elements: " + time + " nanoseconds");
    }
}
