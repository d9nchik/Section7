public class exercise13 {
    public static void main(String[] args) {
        System.out.println(getRandom(20, 40, 57, 9, 1, 23, 45));
    }

    public static int getRandom(int... numbers) {
        return numbers[(int) (Math.random() * numbers.length)];
    }
}
