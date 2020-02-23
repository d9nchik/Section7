import java.util.Scanner;

public class exercise32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = input.nextInt();
        System.out.print("Enter list size: ");
        int[] list = getNumbers(size);
        partition(list);
        System.out.print("After the partition, the list is ");
        exercise31.showNumbers(list);

    }

    public static int partition(int[] list) {
        int high = list.length - 1;
        int low = 1;
        int pivot = 0;
        while (true) {
            if (high < low && list[high] <= list[pivot]) {
                int temp = list[high];
                list[high] = list[pivot];
                list[pivot] = temp;
                return high;
            } else if (low == list.length - 1) {
                int temp = list[low];
                list[low] = list[pivot];
                list[pivot] = temp;
                return low;
            }
            if (list[low] <= list[pivot])
                low++;
            else if (list[high] > list[pivot])
                high--;
            else {
                int temp = list[low];
                list[low] = list[high];
                list[high] = temp;
            }
        }
    }

    public static int[] getNumbers(int n) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[n];
        for (int k = 0; k < numbers.length; k++)
            numbers[k] = input.nextInt();
        return numbers;
    }
}
