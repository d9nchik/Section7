import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        int[] points = getValues();
        int maximum = getMaximum(points);

        for (int k = 0; k < points.length; k++) {
            System.out.println("Student "+k+" score is " + points[k]+" and grade is "+getGrade(maximum, points[k]));
        }
    }

    public static int[] getValues() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        System.out.print("Enter " + numberOfStudents + " scores: ");
        int[] points = new int[numberOfStudents];
        for (int k = 0; k < points.length; k++) {
            points[k] = input.nextInt();
        }
        return points;
    }

    public static int getMaximum(int[] points) {
        int maximum = points[0];
        for (int k = 1; k < points.length; k++) {
            if (points[k] > maximum)
                maximum = points[k];
        }
        return maximum;
    }

    public static char getGrade(int maximum, int point) {
        int difference = maximum - point;
        if (difference <= 5)
            return 'A';
        else if (difference <= 10)
            return 'B';
        else if (difference <= 15)
            return 'C';
        else if (difference <= 20)
            return 'D';
        else
            return 'F';
    }
}
