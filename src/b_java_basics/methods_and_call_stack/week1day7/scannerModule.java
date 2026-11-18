package b_java_basics.methods_and_call_stack.week1day7;

import java.util.Scanner;

public class scannerModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Say Hello");
            System.out.println("2. Show Date");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Hello, Developer!");
                case 2 -> System.out.println("Current Year: " + java.time.Year.now());
                case 3 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
