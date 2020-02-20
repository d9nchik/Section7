public class exercise10 {
    public static void main(String[] args) {
        double[] numbers = exercise9.getNumbers(10);
        int maximumIndex = indexOfLargestElement(numbers);
        System.out.println("The maximum element is " + numbers[maximumIndex] + " with index " + maximumIndex);
    }

    public static int indexOfLargestElement(double[] array) {
        int max = 0;
        for (int k = 1; k < array.length; k++) {
            if (array[max] <= array[k])
                max = k;
        }
        return max;
    }

}
