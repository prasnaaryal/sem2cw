package JOptionPane;
import javax.swing.*;
public class areaOfTriangle {
    public static void main(String[] args) {
        //initialize variables
        double base, height, area;
        base = Double.parseDouble(JOptionPane.showInputDialog("Base of Triangle: "));
        height = Double.parseDouble(JOptionPane.showInputDialog("Height of Triangle: "));
        area = 0.5 *base*height;

        JOptionPane.showMessageDialog( null, "The area of triangle is  " +area);
    }
    
}
