import java.util.Scanner;

public class bai2_6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        if (a == 0) {
            System.out.println("a mustn't be zero.");
            return;
        }
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("x1 = %.2f, x2 = %.2f%n", x1, x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.printf("The equation has one solution: x = %.2f%n", x);
        } else {
            System.out.println("The equation has no solutions.");
        }
        scanner.close();
    }
}
