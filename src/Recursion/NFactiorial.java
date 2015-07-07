package Recursion;

/**
 * Created by sushi on 15-06-20.
 */
public class NFactiorial {

    public static int factorial(int fact) {
        if (fact == 1) return 1;
        else return factorial(fact - 1) * (fact) ;
    }

    public static void main (String[] args)
    {
        System.out.println(factorial(5));
    }
}
