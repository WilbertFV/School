/*******************************************************************************
 * Kean University- Spring 2024
 * Course: CPS*2232*02 - Data Structures
 * Author(s): Wilbert Villalobos
 * HW 4
 *************************************************************************/

import java.util.ArrayList;
import java.util.concurrent.RecursiveTask;

public class MaxFinderArrayList extends RecursiveTask<Integer> {
    private final ArrayList<Integer> list;

    public MaxFinderArrayList(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    protected Integer compute() {
        if (list.size() == 1) {
            return list.get(0);
        } else if (list.isEmpty()) {
            return Integer.MIN_VALUE;
        }
        int mid = list.size() / 2;
        MaxFinderArrayList leftTask = new MaxFinderArrayList(new ArrayList<>(list.subList(0, mid)));
        MaxFinderArrayList rightTask = new MaxFinderArrayList(new ArrayList<>(list.subList(mid, list.size())));

        leftTask.fork();
        int rightResult = rightTask.compute();
        int leftResult = leftTask.join();

        return Math.max(leftResult, rightResult);
    }
}
