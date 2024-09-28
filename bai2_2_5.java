import javax.swing.JOptionPane;
public class bai2_2_5{
    public static void main(String[] args){
        String a, b;
        a = JOptionPane.showInputDialog("Hay nhap so thu nhat: ");
        b = JOptionPane.showInputDialog("Hay nhap so thu hai: ");
        double num1 = Double.parseDouble(a);
        double num2 = Double.parseDouble(b);
        JOptionPane.showMessageDialog(null, "Tong 2 so: " + (num1 + num2));
        JOptionPane.showMessageDialog(null, "Hieu 2 so: " + (num1 - num2));
        JOptionPane.showMessageDialog(null, "Tich 2 so: " + (num1 * num2));
        JOptionPane.showMessageDialog(null, "Thuong 2 so: " + (num1 / num2));
        System.exit(0);
    }
}