import java.util.ArrayList;
import java.util.Scanner;

class Expense {
    String item;
    double amount;

    Expense(String item, double amount) {
        this.item = item;
        this.amount = amount;
    }
}

public class ExpenseTracker {
    public static void main(String[] args) {
        ArrayList<Expense> expenses = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter expense item: ");
                    String item = scanner.next();
                    System.out.print("Enter expense amount: ");
                    double amount = scanner.nextDouble();

                    Expense expense = new Expense(item, amount);
                    expenses.add(expense);
                    System.out.println("Expense added successfully!\n");
                    break;

                case 2:
                    if (expenses.isEmpty()) {
                        System.out.println("No expenses to display.\n");
                    } else {
                        System.out.println("Expense List:");
                        for (Expense e : expenses) {
                            System.out.println("Item: " + e.item + ", Amount: $" + e.amount);
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Exiting Expense Tracker. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.\n");
            }
        }
    }
}