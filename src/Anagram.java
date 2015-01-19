import java.util.LinkedList;
import java.util.List;

/**
 * Created by PierreM on 19/01/2015.
 */
public class Anagram {

    public static List<String> find(String input) {
        List<String> list = new LinkedList<String>();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = ""+input.charAt(i);
        }
        return(list);
    }
}
