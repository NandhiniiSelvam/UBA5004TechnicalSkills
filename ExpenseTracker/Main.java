import java.util.*;

public class Main {
    static ArrayList<Expense> expenses = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n💸 Where Did My Money Go?");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Total Spent");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addExpense(sc);
                    break;
                case 2:
                    viewExpenses();
                    break;
                case 3:
                    totalSpent();
                    break;
                case 4:
                    System.out.println("Goodbye 👋");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }

    static void addExpense(Scanner sc) {
        System.out.print("Enter category: ");
        String category = sc.nextLine();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        expenses.add(new Expense(category, amount));
        System.out.println("Expense added!");
    }

    static void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses yet!");
        } else {
            for (Expense e : expenses) {
                e.display();
            }
        }
    }

    static void totalSpent() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.amount;
        }
        System.out.println("Total spent: ₹" + total);
    }
}
