import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        //Variables
        Scanner in = new Scanner(System.in);

        String userFirstName, userLastName;
        double trash;

        System.out.println("What is your first name?");
        userFirstName = in.nextLine();

        System.out.println("What is your last name?");
        userLastName = in.nextLine();

        System.out.println("Your name is " + userFirstName + " " + userLastName);



    }
}
