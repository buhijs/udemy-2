import java.util.Scanner;

public class GettingUserInput_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out
                .println("Hi. My name is Bob the computer. What is your first name?");

        String firstName = input.nextLine();
        // how would you do this with a char type (instead of string?) - ask one
        // of the others

        System.out.println("Great. So your first name is " + firstName + "\n");

        Scanner input2 = new Scanner(System.in);

        System.out.println("And what's your second name?");

        String secondName = input2.nextLine();

        System.out.println("Super stuff - your second name is " + secondName);

    }
}
