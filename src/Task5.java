import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        //Variables
        Scanner in = new Scanner(System.in);
        double userTemp;
        String trash;

        //collect temp
        System.out.println("Please enter the temperature of the water in Fahrenheit");

        if (in.hasNextDouble()) {

            userTemp = in.nextDouble();

            if (userTemp >= 212) {

                System.out.println("The waster is boiling and is in a gas state");

            }

            else if (userTemp <= 32) {

                System.out.println("The water is frozen and is a solid");

            }

            else {

                System.out.println("Your water is a liquid");

            }

        }

        else {

            trash = in.nextLine();
            System.out.println("You gave an invalid value: " + trash);

        }

    }
}
