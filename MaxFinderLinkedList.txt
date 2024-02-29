/*******************************************************************************
 * Kean University- Spring 2024
 * Course: CPS*2232*02 - Data Structures
 * Author(s): Wilbert Villalobos
 * HW 4
 *************************************************************************/

import java.util.LinkedList;
import java.util.concurrent.RecursiveTask;

public class MaxFinderLinkedList extends RecursiveTask<Integer> {
    private final LinkedList<Integer> list;

    public MaxFinderLinkedList(LinkedList<Integer> list) {
        this.list = list;
    }

    @Override
    protected Integer compute() {
        if (list.size() == 1) {
            return list.getFirst();
        } else if (list.isEmpty()) {
            return Integer.MIN_VALUE;
        }

        int mid = list.size() / 2;
        LinkedList<Integer> leftList = new LinkedList<>(list.subList(0, mid));
        LinkedList<Integer> rightList = new LinkedList<>(list.subList(mid, list.size()));

        MaxFinderLinkedList leftTask = new MaxFinderLinkedList(leftList);
        MaxFinderLinkedList rightTask = new MaxFinderLinkedList(rightList);

        leftTask.fork();
        int rightResult = rightTask.compute();
        int leftResult = leftTask.join();

        return Math.max(leftResult, rightResult);
    }
}
