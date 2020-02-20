import java.util.Arrays;

public class exercise6 {
    public static void main(String[] args) {
        System.out.println("Прості числа до 50");
        showPrimeNumbers(primeNumbers(50));
    }


    public static int[] primeNumbers(int n) {
        boolean[] numbers = new boolean[n - 1];
        Arrays.fill(numbers, true);
        int counter = 0;

        for (int k = 0; k < n - 1; k++) {
            if (!numbers[k])
                continue;
            counter++;
            for (int j = (2 * k + 2); j < n - 1; j += (2 + k)) {
                numbers[j] = false;
            }
        }
        int[] numbersToReturn = new int[counter];
        counter = 0;
        for (int k = 0; k < n - 1; k++) {
            if (numbers[k]) {
                numbersToReturn[counter] = k + 2;
                counter++;
            }
        }
        return numbersToReturn;
    }

    public static void showPrimeNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
