import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        System.out.println("The maximum number is " + max(getNumbers(10)));
    }

    public static double max(double[] array) {
        double max = array[0];
        for (double v : array) {
            if (max < v)
                max = v;
        }
        return max;
    }

    public static double[] getNumbers(int n) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[n];
        System.out.print("Enter ten numbers: ");
        for (int k = 0; k < numbers.length; k++)
            numbers[k] = input.nextDouble();
        return numbers;
    }

}
