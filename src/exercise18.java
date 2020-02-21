public class exercise18 {
    public static void main(String[] args) {
        double[] sorted = bubbleSort(exercise9.getNumbers(10));
        System.out.println("Відсортований список: ");
        for (double v : sorted) {
            System.out.print(v + " ");
        }
    }

    public static double[] bubbleSort(double[] array) {
        boolean change = true;
        while (change) {
            change = false;
            for (int k = 0; k < array.length - 1; k++) {
                if (array[k] > array[k + 1]) {
                    change = true;
                    double temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }
        }
        return array;
    }
}
