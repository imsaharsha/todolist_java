import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equalsIgnoreCase("quit")) {
            System.out.println("Enter a to-do item (type 'quit' to exit): ");
            input = scanner.nextLine();

            if (!input.equalsIgnoreCase("quit")) {
                todoList.add(input);
                System.out.println("Item added to to-do list.");
            }
        }

        System.out.println("\nTo-do list:");
        for (int i = 0; i < todoList.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, todoList.get(i));
        }

        scanner.close();
    }
}
