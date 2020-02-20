import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        int number = input.nextInt();
        int counterEven = 0;
        int counterOdd = 0;
        while (number != 0) {
            if (number % 2 == 0)
                counterEven++;
            else
                counterOdd++;
            number = input.nextInt();
        }

        System.out.println("The number of odds numbers: " + counterOdd);
        System.out.println("The number of even numbers: " + counterEven);
    }
}
