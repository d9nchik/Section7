public class exercise27 {
    public static void main(String[] args) {
        if (isSortedConstantInterval(exercise19.getNumbers()))
            System.out.println("The list is sorted with a constant interval.");
        else
            System.out.println("The list is not sorted with a constant interval");
    }

    public static boolean isSortedConstantInterval(int[] list) {
        int difference = list[1]-list[0];
        for (int k = 1; k < list.length - 1; k++) {
            if (list[k + 1]-list[k]!=difference) {
                return false;
            }
        }
        return true;
    }
}
