/**
 * Created by PierreM on 19/01/2015.
 */
public class LaunchHailstone {
    public static void main(String[] args) {
        LaunchHailstone l = new LaunchHailstone();
        l.run();
    }
    public void run() {
        Hailstone h = new Hailstone();
        h.calculate(4375);
        System.out.println(h.list.toString());
    }
}
