public class exercise14 {
    public static void main(String[] args) {
        int[] numbers = exercise12.getNumbers(5);
        System.out.println("The least common multiply is " + lcm(numbers));
    }

    public static int lcm(int... numbers) {
        int lcm = 1;
        boolean answer = true;
        while (answer) {
            answer = false;
            for (int number : numbers) {
                if (lcm % number != 0) {
                    answer = true;
                    lcm++;
                    break;
                }
            }
        }
        return lcm;
    }
}
