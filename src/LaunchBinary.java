import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by PierreM on 19/01/2015.
 */
public class LaunchBinary {
    public static void main(String[] args) {
        LaunchBinary l = new LaunchBinary();
        l.run();
    }

    public void run() {
        Random randomGenerator = new Random();
        List<Integer> unsortedList = new LinkedList<Integer>();
        for (int i=0; i<20; i++)
            unsortedList.add(randomGenerator.nextInt(100));
        List<Integer> sortedList = Sort.mergeSort(unsortedList);

        if (Binary.search(sortedList, 7))
            System.out.println("Number found!");
        else
            System.out.println("Sorry, not in the list!");

        for (int i=0; i<20; i++) {
            System.out.print(sortedList.get(i)+" ");
        }
    }
}
