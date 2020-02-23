import java.util.Scanner;

public class exercise33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        System.out.print("Enter number of month(1-12): ");
        System.out.println("Your month is " + (months[input.nextInt() - 1]));
    }
}
