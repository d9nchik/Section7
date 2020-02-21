import java.util.Scanner;

public class exercise19 {
    public static void main(String[] args) {
        if (isSorted(getNumbers()))
            System.out.println("The list is already sorted");
        else
            System.out.println("The list is not sorted");
    }

    public static boolean isSorted(int[] list) {
        for (int k = 0; k < list.length - 1; k++) {
            if (list[k] < list[k + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] getNumbers() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list: ");
        int[] numbers = new int[input.nextInt()];
        for (int k = 0; k < numbers.length; k++)
            numbers[k] = input.nextInt();
        return numbers;
    }
}
