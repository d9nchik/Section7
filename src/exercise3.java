import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] occurrence = new int[50];
        System.out.print("Enter the integers between 1 and 50: ");
        int number = input.nextInt();

        while (number != 0) {
            occurrence[number - 1]++;
            number = input.nextInt();
        }

        for (int k = 0; k < 50; k++) {
            if (occurrence[k] == 1)
                System.out.println((k + 1) + " occurs 1 time");
            else if (occurrence[k] != 0)
                System.out.println((k + 1 + " occurs " + occurrence[k] + " times"));
        }
    }
}
