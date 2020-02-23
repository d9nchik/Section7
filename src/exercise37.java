import java.util.Scanner;

public class exercise37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of balls to drop: ");
        int balls = input.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");

        int[] slots = new int[input.nextInt()];

        for (int k = 0; k < balls; k++) {
            int right = 0;
            for (int j = 1; j < slots.length; j++) {
                if ((int) (Math.random() * 2) == 0) {
                    right++;
                    System.out.print("R");
                } else
                    System.out.print("L");
            }
            System.out.println();
            slots[right]++;
        }

        int maximum = slots[0];
        for (int k = 1; k < slots.length; k++) {
            if (maximum < slots[k])
                maximum = slots[k];
        }

        for (; maximum > 0; maximum--) {
            for (int slot : slots) {
                if (slot >= maximum)
                    System.out.print(0);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
