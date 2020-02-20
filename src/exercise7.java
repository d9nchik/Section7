public class exercise7 {
    public static void main(String[] args) {
        int[] counter = getCounter();
        System.out.println("Count of generated numbers: ");
        for (int k = 0; k < counter.length; k++) {
            System.out.println(k + " - " + counter[k]);
        }
    }

    public static int[] getCounter() {
        int[] counts = new int[10];
        for (int k = 0; k < 200; k++) {
            int number = (int) (Math.random() * 10);
            counts[number]++;
        }
        return counts;
    }
}
