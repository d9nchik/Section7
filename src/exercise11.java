public class exercise11 {
    public static void main(String[] args) {
        double[] numbers = exercise9.getNumbers(10);
        System.out.printf("Mean is %.2f\n", mean(numbers));
        System.out.printf("The standard deviation is %.5f\n", deviation(numbers));
    }

    public static double deviation(double[] x) {
        double mean = mean(x);
        double sum = 0;
        for (double v : x) {
            sum += Math.pow((v - mean), 2);
        }

        return Math.sqrt(sum / (x.length - 1));
    }

    public static double mean(double[] x) {
        double sum = 0;
        for (double v : x) {
            sum += v;
        }
        return sum / x.length;
    }
}
