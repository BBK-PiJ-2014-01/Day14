import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by Pierre on 25/01/2015.
 */
public class LaunchSort {
    public static void main(String[] args) {
        LaunchSort l = new LaunchSort();
        l.run();
    }

    public void run() {
        Random randomGenerator = new Random();
        List<Integer> unsortedList = new LinkedList<Integer>();
        for (int i=0; i<20; i++)
            unsortedList.add(randomGenerator.nextInt(100));

        System.out.println("\nUnsorted list:");
        for (int i=0; i<20; i++) {
            System.out.print(unsortedList.get(i)+" ");
        }

        List<Integer> mergeSortedList = Sort.mergeSort(unsortedList);

        System.out.println("\nSorted list with Mergesort:");
        for (int i=0; i<20; i++) {
            System.out.print(mergeSortedList.get(i)+" ");
        }

        List<Integer> quickSortedList = Sort.quickSort(unsortedList);

        System.out.println("\nSorted list with Quicksort:");
        for (int i=0; i<20; i++) {
            System.out.print(quickSortedList.get(i)+" ");
        }

    }
}
