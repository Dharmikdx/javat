package Second_A04_TernaryOperator;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        //Let's take two int variables

        int num1 = 50, num2 = 70;
                int max;

        // Check for larger
        max = (num1 > num2) ? num1 : num2;

        // Print the largest number
        System.out.println("Largest number between " + num1 +
                " and " + num2 + " is: " + max + ". " );
    }
}
