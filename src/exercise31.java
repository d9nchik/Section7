import java.util.Scanner;

public class exercise31 {
    public static void main(String[] args) {
        System.out.print("Enter list1 size and contents: ");
        int[] list1 = getNumbers();
        System.out.print("Enter list2 size and contents: ");
        int[] list2 = getNumbers();
        System.out.print("list1 is ");
        showNumbers(list1);
        System.out.print("list2 is ");
        showNumbers(list2);
        System.out.print("The merged list is ");
        showNumbers(merge(list1, list2));
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] list3 = new int[list1.length + list2.length];

        int position1 = 0;
        int position2 = 0;

        for (int k = 0; k < list3.length; k++) {
            if ((position2 == list2.length) || ((position1 < list1.length) && (list1[position1] <= list2[position2]))) {
                list3[k] = list1[position1];
                position1++;
            } else {
                list3[k] = list2[position2];
                position2++;
            }
        }
        return list3;
    }

    public static int[] getNumbers() {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[input.nextInt()];
        for (int k = 0; k < numbers.length; k++)
            numbers[k] = input.nextInt();
        return numbers;
    }

    public static void showNumbers(int[] numbers) {
        for (int number : numbers)
            System.out.print(number + " ");
        System.out.println();
    }
}
