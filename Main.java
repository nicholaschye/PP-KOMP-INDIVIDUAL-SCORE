import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of submissions: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        
        String[] submissions = new String[num];
        int[] totalScores = new int[num];
        boolean[] isSuspected = new boolean[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter scores for submission " + (i + 1) + ": ");
            submissions[i] = scanner.nextLine();
            String[] scoreParts = submissions[i].split(" ");
            int sum = 0;
            for (String scoreString : scoreParts) {
                sum += Integer.parseInt(scoreString);
            }
            totalScores[i] = sum;
        }

        for (int i = 0; i < num; i++) {
            if (totalScores[i] == 0) {
                continue;
            }
            for (int j = i + 1; j < num; j++) {
                if (totalScores[j] == 0) {
                    continue;
                }
                if (submissions[i].equals(submissions[j])) {
                    isSuspected[i] = true;
                    isSuspected[j] = true;
                }
            }
        }

        for (int i = 0; i < num; i++) {
            if (isSuspected[i]) {
                System.out.println("suspected to have discussed or cheating or allow cheating");
            } else {
                System.out.println(totalScores[i]);
            }
        }
    }
}
