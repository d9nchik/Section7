import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many students?: ");
        int numberOfStudents = input.nextInt();

        String[] namesOfStudents = new String[numberOfStudents];
        int[] scores = new int[numberOfStudents];

        for (int k = 0; k < numberOfStudents; k++) {
            System.out.print("Enter name of student " + (k + 1) + ": ");
            namesOfStudents[k] = input.next();
            System.out.print("Enter his score: ");
            scores[k] = input.nextInt();
        }

        for (int k = 0; k < numberOfStudents; k++) {
            int maximum = k;
            for (int j = (k + 1); j < numberOfStudents; j++) {
                if (scores[maximum] < scores[j]) {
                    maximum = j;
                }
            }

            String temp = namesOfStudents[maximum];
            int tempScore = scores[maximum];
            namesOfStudents[maximum] = namesOfStudents[k];
            scores[maximum] = scores[k];
            namesOfStudents[k] = temp;
            scores[k] = tempScore;
        }

        System.out.println("Sorted students:");
        for (int k = 0; k < namesOfStudents.length; k++) {
            System.out.println((k + 1) + " " + namesOfStudents[k] + " " + scores[k]);
        }
    }
}
