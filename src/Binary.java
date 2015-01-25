import java.util.LinkedList;
import java.util.List;

/**
 * Created by PierreM on 19/01/2015.
 */
public class Binary {
    public static boolean search(List<Integer> list, int number) {
        boolean found;
        List<Integer> nextList = new LinkedList<Integer>();
        if (list == null)
            return(false);
        else {
            if (list.size() == 1) {
                if (list.get(0) == number)
                    return (true);
                else
                    return (false);
            } else {
                int index = list.size() / 2;
                if (list.get(index) == number)
                    return (true);
                if (number < list.get(index)) {
                    for (int i = 0; i < index; i++)
                        nextList.add(list.get(i));
                } else {
                    for (int i = index; i < list.size(); i++)
                        nextList.add(list.get(i));
                }
                found = search(nextList, number);
                return (found);
            }
        }
    }
}
