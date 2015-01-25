import java.util.LinkedList;
import java.util.List;

/**
 * Created by Pierre on 25/01/2015.
 */
public class Polynomial {
    static final double PRECISION = 0.000001;

    int[] polynomial = {1,-5,2};

    public static void main(String[] args) {
        Polynomial p = new Polynomial();
        p.run();
    }

    public void run() {
        List<Double> list = new LinkedList<Double>();
        for (double i=-1000; i<1000; i += 0.01) {
            list.add(calculate(i));
        }
        for (int j=0; j<list.size();j++){
            if (eval(list.get(j)))
                System.out.println("Root found: "+list.get(j));
        }
    }

    public boolean eval(double number) {
        boolean isRoot;
        if (Math.abs(number) < PRECISION)
            isRoot = true;
        else
            isRoot = false;
        return(isRoot);
    }

    public double calculate(double number) {
        double result = polynomial[0] + (polynomial[1]*number) + (polynomial[2]*number*number);
        return(result);
    }
}
