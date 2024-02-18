/*******************************************************************************
 * Kean University- Spring 2024
 * Semester ()
 * Course: CPS*2232*01 - Data Structures
 * Author(s): Wilbert Villalobos CPS2231*07
 * Lab 4
 *************************************************************************/
public class MyLinkedList<E> implements MyList<E> {
  protected Node<E> head, tail;
  protected int size = 0; // Number of elements in the list

  /** Create an empty list */
  public MyLinkedList() {
  }

  /** Create a list from an array of objects */
  public MyLinkedList(E[] objects) {
    for (int i = 0; i < objects.length; i++)
      add(objects[i]);
  }

  /** Return the head element in the list */
  public E getFirst() {
    if (size == 0) {
      return null;
    } else {
      return head.element;
    }
  }

  /** Return the last element in the list */
  public E getLast() {
    if (size == 0) {
      return null;
    } else {
      return tail.element;
    }
  }

  /** Add an element to the beginning of the list */
  public void addFirst(E e) {
    Node<E> newNode = new Node<>(e); // Create a new node
    newNode.next = head; // link the new node with the head
    head = newNode; 
    size++; 

    if (tail == null) 
      tail = head;
  }

  /** Add an element to the end of the list */
  public void addLast(E e) {
    Node<E> newNode = new Node<>(e); // Create a new for element e

    if (tail == null) {
      head = tail = newNode; 
    } else {
      tail.next = newNode;
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
      Node<E> current = head;

      for (int i = 0; i < size - 2; i++) {
        current = current.next;
      }

      E temp = tail.element;
      tail = current;
      tail.next = null;
      size--;
      return temp;
    }
  }

  @Override
  public E remove(int index) {
    if (index < 0 || index >= size) {
      return null;
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
      size--;
      return current.element;
    }
  }

  @Override 
  public String toString() {
    StringBuilder result = new StringBuilder("[");

    Node<E> current = head;
    for (int i = 0; i < size; i++) {
      result.append(current.element);
      current = current.next;
      if (current != null) {
        result.append(", "); // Separate two elements with a comma
      } else {
        result.append("]"); //
      }
    }

    return result.toString();
  }

  @Override /** Clear the list */
  public void clear() {
    size = 0;
    head = tail = null;
  }

  @Override
  public boolean contains(Object e) {
    // Left as an exercise
    return true;
  }

  @Override 
  public E get(int index) {
    // Left as an exercise
    return null;
  }

  @Override 
  public int indexOf(Object e) {
    // Left as an exercise
    return 0;
  }

  @Override 
  public int lastIndexOf(E e) {
    // Left as an exercise
    return 0;
  }

  @Override 
  public E set(int index, E e) {
    // Left as an exercise
    return null;
  }

  @Override
  public java.util.Iterator<E> iterator() {
    return new LinkedListIterator();
  }

  private class LinkedListIterator
      implements java.util.Iterator<E> {
    private Node<E> current = head; // Current index

    @Override
    public boolean hasNext() {
      return (current != null);
    }

    @Override
    public E next() {
      E e = current.element;
      current = current.next;
      return e;
    }

    @Override
    public void remove() {
      // Left as an exercise
    }
  }

  protected static class Node<E> {
    E element;
    Node<E> next;

    public Node(E element) {
      this.element = element;
    }
  }

  @Override /** Return the number of elements in this list */
  public int size() {
    return size;
  }

  public static void main(String[] args) {
    // Create a list
    var myLinkedList = new MyLinkedList<Integer>();

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
