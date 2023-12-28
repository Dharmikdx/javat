package Second_A01_OddEven;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        //For insert value need to create Scanner object
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //Define method to check number odd or even
        numberCheck(number);

    }
    static void numberCheck(int number) {

        // Now time to check inserted number is odd or even
        if (number % 2 == 0)
            System.out.println(number + " is even");
        else
            System.out.println(number + " is odd");

    }

}