import java.util.Scanner;

public class exercise28 {
    public static void main(String[] args) {
        int[] numbers = getNumbers();
        for (int k = 0; k < numbers.length; k++) {
            for (int j = 0; j < numbers.length; j++) {
                if (j == k)
                    continue;
                for (int z = 0; z < numbers.length; z++) {
                    if (z == j||z==k)
                        continue;
                    for (int m = 0; m < numbers.length; m++) {
                        if (m == z||m==j||m==k)
                            continue;
                        System.out.println(numbers[k] + " " + numbers[j] + " " + numbers[z] + " " + numbers[m]);
                    }
                }
            }
        }
    }

    public static int[] getNumbers() {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[4];
        System.out.print("Enter 4 numbers: ");
        for (int k = 0; k < numbers.length; k++)
            numbers[k] = input.nextInt();
        return numbers;
    }
}
