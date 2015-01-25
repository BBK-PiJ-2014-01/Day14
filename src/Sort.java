import java.util.LinkedList;
import java.util.List;

/**
 * Created by Pierre on 25/01/2015.
 */
public class Sort {
    public static List<Integer> mergeSort(List<Integer> unsortedList) {
        List<Integer> resultList = new LinkedList<Integer>();
        if (unsortedList.size() < 2)
            return(unsortedList);
        else {
            List<Integer> lowList = new LinkedList<Integer>();
            List<Integer> highList = new LinkedList<Integer>();
            int midpoint = unsortedList.size() / 2;
            for (int i = 0; i < midpoint; i++) {
                lowList.add(unsortedList.get(i));
            }
            List<Integer> sortedLowList = mergeSort(lowList);
            for (int j = midpoint; j < unsortedList.size(); j++) {
                highList.add(unsortedList.get(j));
            }
            List<Integer> sortedHighList = mergeSort(highList);
            while (!sortedLowList.isEmpty() && !sortedHighList.isEmpty()) {
                if (sortedLowList.get(0) < sortedHighList.get(0)) {
                    resultList.add(sortedLowList.get(0));
                    sortedLowList.remove(0);
                } else {
                    resultList.add(sortedHighList.get(0));
                    sortedHighList.remove(0);
                }
            }
            while (!sortedLowList.isEmpty()) {
                resultList.add(sortedLowList.get(0));
                sortedLowList.remove(0);
            }
            while (!sortedHighList.isEmpty()) {
                resultList.add(sortedHighList.get(0));
                sortedHighList.remove(0);
            }
            return(resultList);
        }
    }

    public static List<Integer> quickSort(List<Integer> unsortedList) {
        List<Integer> resultList = new LinkedList<Integer>();
        if (unsortedList.size() < 2)
            return(unsortedList);
        else {
            List<Integer> lowList = new LinkedList<Integer>();
            List<Integer> highList = new LinkedList<Integer>();
            int pivot = unsortedList.get(0);
            for (int i=1; i<unsortedList.size(); i++) {
                if (unsortedList.get(i) <= pivot)
                    lowList.add(unsortedList.get(i));
                else
                    highList.add(unsortedList.get(i));
            }
            List<Integer> sortedLowList = quickSort(lowList);
            List<Integer> sortedHighList = quickSort(highList);
            while (!sortedLowList.isEmpty()) {
                resultList.add(sortedLowList.get(0));
                sortedLowList.remove(0);
            }
            resultList.add(pivot);
            while (!sortedHighList.isEmpty()) {
                resultList.add(sortedHighList.get(0));
                sortedHighList.remove(0);
            }
            return(resultList);
        }
    }
}
