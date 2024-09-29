import java.util.Scanner;
public class bai2_6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a11: ");
        double a11 = scanner.nextDouble();
        System.out.print("Enter a12: ");
        double a12 = scanner.nextDouble();
        System.out.print("Enter b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Enter a21: ");
        double a21 = scanner.nextDouble();
        System.out.print("Enter a22: ");
        double a22 = scanner.nextDouble();
        System.out.print("Enter b2: ");
        double b2 = scanner.nextDouble();
        
        double delta = a11 * a22 - a12 * a21;
        double delta1 = b1 * a22 - b2 * a12;
        double delta2 = a11 * b2 - a21 * b1;
        
        if (delta == 0) {
            if (delta1 == 0 && delta2 == 0) {
                System.out.println("The system has many solutions.");
            } else {
                System.out.println("The system has no solution.");
            }
        } else {
            double x1 = delta1 / delta;
            double x2 = delta2 / delta;
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        scanner.close();
    }
}
