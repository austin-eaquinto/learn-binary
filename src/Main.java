import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int response = 0;

        System.out.println("Hello, and welcome to binary learning.");
        System.out.println("What would you like to do today?");
        System.out.println("1. Convert decimal to binary\n2. Learn how to count in binary\n3. Instructions\n4. Quit");
        Scanner scanner = new Scanner(System.in);


        while (response != 4) {
            System.out.println("What would you like to do next?");
            System.out.print("Option: ");
            response = scanner.nextInt();   // user choice is updated here. breaks out of loop with quit option

            switch (response) {
                case 1:     // convert decimal to binary
                    binaryConverter converter = new binaryConverter();
                    converter.runConverter(scanner);
                    break;
                case 2:     // count from zero in binary
                    binaryCounter.binaryIncrementer(scanner);
                    break;
                case 3:     // instructions for the program
                    Instructions readInstructions = new Instructions();
                    readInstructions.optionInstructions();
                    break;
                case 4:     // end program
                    System.out.println("Good work! See you next time.");
                    break;
            }
        }

        scanner.close(); // close scanner to release input resource
    }
}