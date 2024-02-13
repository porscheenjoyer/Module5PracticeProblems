import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        //Variables
        Scanner in = new Scanner(System.in);
        double userNumOne, userNumTwo, product;
        String trash;

        //Collect Input
        System.out.println("What is your first number to multiply?");

        if(in.hasNextDouble()){

            userNumOne = in.nextDouble();

            System.out.println("What is your second number?");

            if (in.hasNextDouble()) {

                userNumTwo = in.nextDouble();

                product = userNumOne * userNumTwo;

                System.out.println(userNumOne + " Times " + userNumTwo + " is: " + product);

            }

            else {

                trash = in.nextLine();
                System.out.println("Your second input is an invalid value, please enter a number");

            }

        }

        else {

            trash = in.nextLine();
            System.out.println("You entered an invalid value, please enter a number");

        }


    }
}
