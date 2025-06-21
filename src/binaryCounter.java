import java.util.Scanner;

public class binaryCounter {
    public static void binaryIncrementer(Scanner scanner) {
        int num = 0;
        String enter;

        System.out.println("Starting from zero:");
        System.out.println("Press Enter to increment by 1 in binary.");
        System.out.println("Type 'q' to quit.");
        scanner.nextLine();     // consume leftover newline

        do {
            System.out.println(num + " -> " + Integer.toBinaryString(num));
            enter = scanner.nextLine();  // Wait for Enter or 'q'
            num++;
        } while (!enter.equalsIgnoreCase("q"));
    }
}
