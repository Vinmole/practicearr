import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        int passed = 0;
        int failed = 0;
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score " + (i + 1) + " (0 - 100): ");
            int score = sc.nextInt();
            while (score < 0 || score > 100) {
                System.out.print("Invalid score. Enter again (0 - 100): ");
                score = sc.nextInt();
            }
            scores[i] = score;
        }

        System.out.print("Scores: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
            sum += scores[i];
            if (scores[i] >= 60) {
                passed++;
            } else {
                failed++;
            }
        }
        System.out.println();
        System.out.println("Pass: " + passed);
        System.out.println("Fail: " + failed);
        System.out.println("Average: " + (double) sum / scores.length);
    }
}
