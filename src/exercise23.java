public class exercise23 {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];
        for (int k = 0; k < lockers.length; k++) {
            for (int j = k; j < lockers.length; j+=k+1) {
                lockers[j] = !lockers[j];
            }
        }

        System.out.println("Ending result: ");
        for (int l=0; l<lockers.length;l++){
            System.out.print((l+1)+" is ");
            if (lockers[l])
                System.out.println("opened");
            else
                System.out.println("closed");
        }
    }
}
