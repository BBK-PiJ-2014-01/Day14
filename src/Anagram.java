import java.util.LinkedList;
import java.util.List;

/**
 * Created by PierreM on 19/01/2015.
 */
public class Anagram {

    public static List<String> find(String input) {
        List<String> list = new LinkedList<String>();
        for (int i = 0; i < input.length(); i++) {
            String firstLetter = ""+input.charAt(0);
            String rest = input.substring(0,i)+input.substring(1,input.length());
            for (int j=0;j < rest.length();j++) {

            }
        }
        return(list);
    }
}
