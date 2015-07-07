package displaytime;


import java.util.Scanner;

/**
 * Created by sushi on 15-06-06.
 */
public class DisplayTimeJava {

    // take an input from console
    public static void main(String[] args) {

        System.out.println("Pls enter time in seconds");
        Scanner input = new Scanner(System.in);

        int inputSeconds = input.nextInt();

        int minutes = inputSeconds / 60;
        int remainingSeconds = inputSeconds % 60;

        System.out.println("The converted seconds are " + minutes + " minutes " + remainingSeconds + " seconds ");
        System.out.println("cast 1.7 to an INT " + (int)1.7);
    }
}
