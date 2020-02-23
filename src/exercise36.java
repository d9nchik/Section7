public class exercise36 {
    public static void main(String[] args) {
        int[] queens = {0, 6, 4, 7, 1, 3, 5, 2};
        for (int k=0;k<queens.length;k++){
            for (int queen : queens) {
                if (queen == k)
                    System.out.print("|Q");
                else
                    System.out.print("| ");
            }
            System.out.println("|");
        }
    }
}
