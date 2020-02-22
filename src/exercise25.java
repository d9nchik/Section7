import java.util.Scanner;

public class exercise25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] eqn = new double[3];
        System.out.print("Enter a, b, c: ");
        for (int k = 0; k < 3; k++) {
            eqn[k] = input.nextDouble();
        }
        double[] roots = new double[2];

        int numberOfRoots = solveQuadratic(eqn, roots);

        if (numberOfRoots == 2)
            System.out.println("The equation has two roots " + (int) (roots[0] * 1_000_000) / 1_000_000.0 +
                    " and " + (int) (roots[1] * 1_000_000) / 1_000_000.0);
        else if (numberOfRoots == 1)
            System.out.println("The equation has one root " + (int) (roots[0] * 1_000_000) / 1_000_000.0);
        else
            System.out.println("The equation has no real roots");

    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        double discriminant = eqn[1] * eqn[1] - 4 * eqn[0] * eqn[2];

        if (discriminant > 0) {
            roots[0] = (-eqn[1] + Math.sqrt(discriminant)) / 2 / eqn[0];
            roots[1] = (-eqn[1] - Math.sqrt(discriminant)) / 2 / eqn[0];
            return 2;
        } else if (discriminant == 0) {
            roots[0] = -eqn[1] / 2 / eqn[0];
            return 1;
        } else {
            return 0;
        }
    }
}
