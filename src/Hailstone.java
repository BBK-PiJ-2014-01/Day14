import java.util.ArrayList;
import java.util.List;

/**
 * Created by PierreM on 19/01/2015.
 */
public class Hailstone {

    List<Integer> list = new ArrayList<Integer>();

    public void calculate(int number) {
        int newNumber;
        if (number%2 == 0)
            newNumber = number / 2;
        else
            newNumber = (number * 3) + 1;
        list.add(newNumber);
        if (list.size() < 1000)
            calculate(newNumber);
    }
}
