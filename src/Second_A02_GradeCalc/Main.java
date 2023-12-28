package Second_A02_GradeCalc;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Students Marks:");
        int marks = sc.nextInt();
        char grade;
//Using If Else Condition..!
        if (marks >= 89) {
            grade = 'A';
            System.out.println("You achived A grade" );
        } else if (marks >= 79 && marks < 89) {
            grade = 'B';
            System.out.println("You achived B grade" );

        } else if (marks >= 69 && marks < 79) {
            grade = 'C';
            System.out.println("You achived C grade" );

        } else if (marks >=59 && marks < 69){
            grade = 'D';
            System.out.println("You achived D grade" );

        } else {
            grade = 'F';
            System.out.println("Your grade is F, Try Again.!" );

        }
    }
}
