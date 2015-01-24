import java.util.LinkedList;
import java.util.List;

/**
 * Created by PierreM on 19/01/2015.
 */
public class Anagram {

    public static List<String> find(String input) {
        String tempOutput = "";
        List<String> list = new LinkedList<String>();
        for (int i = 0; i < input.length(); i++) {
            String firstLetter = ""+input.charAt(i);
            String rest = ""+input.substring(0,i)+input.substring(i+1,input.length());
            List<String> restList = new LinkedList<String>();;
            if (rest.length()==1)
                restList.add(rest);
            else
                restList = find(rest);
            for (int j=0;j < restList.size();j++) {
                tempOutput = ""+input.charAt(i)+restList.get(j);
                list.add(tempOutput);
            }
        }
        return(list);
    }
}
