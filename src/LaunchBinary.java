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
        List<Integer> list = new LinkedList<Integer>();
        for (int i=0;i<50;i++) {
            list.add(i*2);
        }
        Binary b = new Binary();
        if (b.search(list, 7))
            System.out.println("Number found!");
        else
            System.out.println("Sorry, not in the list!");
        System.out.println(list.toString());
    }
}
