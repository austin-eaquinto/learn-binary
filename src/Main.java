import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, and welcome to binary learning.");
        System.out.println("What would you like to do today?");
        System.out.println("1. Convert decimal to binary\n2. Learn how to count in binary\n3. Quit");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        scanner.nextLine();                         // clears the newline character of the previous line

        String binaryResult = convertToBinary(userInput); // calls the function
        System.out.println("Binary: " + binaryResult); // concats string with string variable

        binaryIncrementer(scanner);                 // runs the binaryIncrement function using 'enter' as the button click

        scanner.close(); // why does the scanner need to be closed?
    }

    /* in Main but outside of main per Java rules */
    public static String convertToBinary(int number) {
        return Integer.toBinaryString(number); // built-in function to convert numbers to binary
    }

    public static void binaryIncrementer(Scanner scanner) {
        int num = 0;
        String enter;

        System.out.println("Starting from zero:");
        System.out.println("Press Enter to increment by 1 in binary.");
        System.out.println("Type 'q' to quit.");

        do {
            System.out.println(num + " -> " + Integer.toBinaryString(num));
            enter = scanner.nextLine();  // Wait for Enter or 'q'
            num++;
        } while (!enter.equalsIgnoreCase("q"));
    }
}