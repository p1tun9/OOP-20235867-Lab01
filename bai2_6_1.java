import java.util.Scanner;
public class bai2_6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Hệ có vô số nghiệm.");
            } else {
                System.out.println("Hệ vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("x = " + x);
        }
        scanner.close();
    }
}
