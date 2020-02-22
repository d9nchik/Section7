public class exercise29 {
    public static void main(String[] args) {
        final int SUM = 9;
        System.out.println("All combination in which sum will be " + SUM + ":");
        for (int k = 1; k <= 6; k++) {
            for (int m = 1; m <= 6; m++) {
                int third = SUM - k - m;
                if (third < 1)
                    break;
                System.out.println(k + " " + m + " " + third);
            }
        }
    }
}
