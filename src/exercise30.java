import java.util.Scanner;

public class exercise30 {
    public static void main(String[] args) {
        if (isConsecutiveFour(getNumbers()))
            System.out.println("The list has consecutive fours");
        else
            System.out.println("The list has no consecutive fours");
    }

    public static boolean isConsecutiveFour(int[] values) {
        int numberInSeries = values[0];
        int counter = 1;
        for (int k = 1; k < values.length; k++) {
            if (numberInSeries == values[k]) {
                counter++;
                if (counter == 4)
                    return true;
            } else {
                numberInSeries = values[k];
                counter = 1;
            }

        }
        return false;
    }

    public static int[] getNumbers() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int[] numbers = new int[input.nextInt()];
        System.out.print("Enter the values: ");
        for (int k = 0; k < numbers.length; k++)
            numbers[k] = input.nextInt();
        return numbers;
    }
}
