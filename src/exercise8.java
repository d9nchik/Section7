import java.util.Scanner;

public class exercise8 {
    public static int average(int[] array) {
        int sum = 0;
        for (int i : array) sum += i;
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double i : array) sum += i;
        return sum / array.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double[] numbers = new double[10];

        for (int k = 0; k < numbers.length; k++) {
            numbers[k] = input.nextDouble();
        }

        System.out.println("Average is equal " + average(numbers));
    }
}
