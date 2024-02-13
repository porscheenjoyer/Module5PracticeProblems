import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        //Variables
        Scanner in = new Scanner(System.in);
        int userNum;
        String trash;

        //Collect Input
        System.out.println("Please enter an integer(positive or negative number or 0)");

        if (in.hasNextInt()) {

            userNum = in.nextInt();

            //Positive
            if (userNum > 0) {

                System.out.println("Your number " + userNum + " is positive.");

            }

            //Negative
            else if (userNum < 0) {

                System.out.println("Your number " + userNum + " is negative.");

            }

            //Is it 0?
            else if (userNum == 0) {

                System.out.println("Your number is 0.");

            }

        }

        else {

            trash = in.nextLine();
            System.out.println("You entered an invalid value: " + trash);

        }

    }
}
