public class exercise21 {
    public static void main(String[] args) {
        double[] numbers = exercise9.getNumbers(10);
        normalise(numbers);
        System.out.println("Normalised numbers  are: ");
        for (double number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void normalise(double[] numbers) {
        double maximum = numbers[0];
        for (int k = 1; k < numbers.length; k++) {
            if (maximum < numbers[k])
                maximum = numbers[k];
        }

        for (int k = 0; k < numbers.length; k++) {
            numbers[k] /= maximum;
        }
    }
}
