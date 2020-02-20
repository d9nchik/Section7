import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        int[] scores = getScores();
        int average = calculateAverage(scores);
        int less = countOfLess(scores, average);

        System.out.println("Above or equal average are " + (scores.length - less) + " scores");
        System.out.println("Less than average are " + less + " scores");
    }

    public static int[] getScores() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter score: ");
        int[] scores = new int[100];
        int number = input.nextInt();
        int counter = 0;
        while (number >= 0) {
            scores[counter] = number;
            counter++;
            number = input.nextInt();
        }
        int[] outScores = new int[counter];
        System.arraycopy(scores, 0, outScores, 0, counter);
        return outScores;
    }

    public static int calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    public static int countOfLess(int[] scores, int average) {
        int counter = 0;
        for (int score : scores) {
            if (score >= average)
                counter++;
        }
        return counter;
    }
}
