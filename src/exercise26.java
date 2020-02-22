public class exercise26 {
    public static void main(String[] args) {
        if (isSorted(exercise19.getNumbers()))
            System.out.println("The list is sorted");
        else
            System.out.println("The list is not sorted");
    }

    public static boolean isSorted(int[] list) {
        for (int k = 0; k < list.length - 1; k++) {
            if (list[k] > list[k + 1]) {
                return false;
            }
        }
        return true;
    }
}
