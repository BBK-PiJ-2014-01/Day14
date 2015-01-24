import java.util.List;

/**
 * Created by Pierre on 21/01/2015.
 */
public class LaunchAnagram {
    public static void main(String[] args) {
        LaunchAnagram l = new LaunchAnagram();
        l.run();
    }

    public void run() {
        String input = "pierre";
        List<String> list = Anagram.find(input);
        list.toString();
    }
}
