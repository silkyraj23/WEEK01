import java.util.Scanner;
public class QuadraticRoot {
    public static double[] findRoot(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return new double[]{};  // No real roots
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter coefficients a, b, and c:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double[] root = findRoot(a, b, c);
        if (root.length == 0) {
            System.out.println("No real roots.");
        } else if (root.length == 1) {
            System.out.println("The root is: " + root[0]);
        } else {
            System.out.println("The roots are: " + root[0] + " and " + root[1]);
        }
        //vlosing the input stream
        input.close();
    }
}