import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //Variables
        Scanner in = new Scanner(System.in);
        int userInt;
        double userDouble;
        String trash;

        //Ask for num
        System.out.println("What is your number?");

        //int or double
        if (in.hasNextInt()) {

            userInt = in.nextInt();
            System.out.println("You input an integer: " + userInt);

        }

        if (in.hasNextDouble()) {

            userDouble = in.nextDouble();
            System.out.println("You input a double: " + userDouble);

        }

        else {

            trash = in.nextLine();
            System.out.println("You gave me an incorrect value: " + trash);

        }

    }
}
