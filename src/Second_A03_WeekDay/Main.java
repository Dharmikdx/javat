package Second_A03_WeekDay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number between 1-7: ");
        int day = sc.nextInt();

        System.out.println(getDayName(day));
    }

    // Get the name for the Week
    public static String getDayName(int day) {
        String nameOfDay = "";
        switch (day) {
            //
            case 1: nameOfDay = "Monday"; break;
            case 2: nameOfDay = "Tuesday"; break;
            case 3: nameOfDay = "Wednesday"; break;
            case 4: nameOfDay = "Thursday"; break;
            case 5: nameOfDay = "Friday"; break;
            case 6: nameOfDay = "Saturday"; break;
            case 7: nameOfDay = "Sunday"; break;
            default:nameOfDay = "Please insert number between 1-7";
        }

        return nameOfDay;
    }
}
