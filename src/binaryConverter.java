import java.util.Scanner;

public class binaryConverter {
    public void runConverter(Scanner scanner) {
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        scanner.nextLine(); // clear newline

        String binaryResult = Integer.toBinaryString(userInput);
        System.out.println("Binary: " + binaryResult);
    }
}
