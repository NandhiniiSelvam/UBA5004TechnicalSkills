import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🎓 CGPA Calculator (SIMATS)");
        System.out.println("Grades: S=10, A=9, B=8, C=7\n");

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        sc.nextLine();

        int totalPoints = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter grade for subject " + i + " (S/A/B/C): ");
            String grade = sc.nextLine().toUpperCase();

            switch (grade) {
                case "S":
                    totalPoints += 10;
                    break;
                case "A":
                    totalPoints += 9;
                    break;
                case "B":
                    totalPoints += 8;
                    break;
                case "C":
                    totalPoints += 7;
                    break;
                default:
                    System.out.println("❌ Invalid grade! Enter again.");
                    i--; // repeat same subject
            }
        }

        double cgpa = (double) totalPoints / n;

        System.out.println("\n📊 Total Grade Points: " + totalPoints);
        System.out.println("🎯 CGPA: " + String.format("%.2f", cgpa));
    }
}
