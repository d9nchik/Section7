import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        int[] numbers = getElevenInteger();
        for (int k = 0; k < 10; k++) {
            System.out.println((k + 1) + "st number is " + compareToEleventh(numbers[10], numbers[k]) + " than eleventh");
        }
    }

    public static int[] getElevenInteger() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 11 integers: ");
        int[] numbers = new int[11];
        for (int k = 0; k < numbers.length; k++) {
            numbers[k] = input.nextInt();
        }
        return numbers;
    }

    public static String compareToEleventh(int eleventh, int number) {
        if (eleventh < number)
            return "greater";
        if (eleventh == number)
            return "equal";
        return "smaller";
    }
}
