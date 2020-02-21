import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        int[] numbers = reverse(getNumbers(10));
        System.out.print("Числа: ");
        for (int v : numbers)
            System.out.print(v + " ");
    }

    public static int[] reverse(int[] list) {
        for (int k = 0; k <= (list.length - 1) / 2; k++) {
            int temp = list[k];
            list[k] = list[list.length - 1 - k];
            list[list.length - 1 - k] = temp;
        }
        return list;
    }

    public static int[] getNumbers(int n) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[n];
        System.out.print("Enter ten numbers: ");
        for (int k = 0; k < numbers.length; k++)
            numbers[k] = input.nextInt();
        return numbers;
    }
}
