public class exercise15 {
    public static void main(String[] args) {
        int[] numbers = exercise12.getNumbers(10);
        System.out.print("The distinct numbers are: ");
        numbers = eliminateDuplicates(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] copyOfList = new int[list.length];
        int counter = 0;
        for (int k = 0; k < list.length; k++) {
            boolean add = true;
            for (int j = 0; j < k; j++) {
                if (list[j] == list[k]) {
                    add = false;
                    break;
                }
            }

            if (add) {
                copyOfList[counter] = list[k];
                counter++;
            }
        }

        int[] returningArray = new int[counter];
        System.arraycopy(copyOfList, 0, returningArray, 0, counter);
        return returningArray;
    }
}
