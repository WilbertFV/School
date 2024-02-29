/*******************************************************************************
 * Kean University- Spring 2024
 * Course: CPS*2232*02 - Data Structures
 * Author(s): Wilbert Villalobos
 * HW 4
 *************************************************************************/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ForkJoinPool;

public class CompareArrayListLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Populate both lists with the same data
        for (int i = 0; i < 15; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        ForkJoinPool pool = new ForkJoinPool();

        MaxFinderArrayList arrayListTask = new MaxFinderArrayList(arrayList);
        MaxFinderLinkedList linkedListTask = new MaxFinderLinkedList(linkedList);

        long start = System.currentTimeMillis();
        pool.invoke(arrayListTask);
        long end = System.currentTimeMillis();
        System.out.println("ArrayList time: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        pool.invoke(linkedListTask);
        end = System.currentTimeMillis();
        System.out.println("LinkedList time: " + (end - start) + "ms");
    }
}
