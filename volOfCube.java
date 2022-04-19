package JOptionPane;
import javax.swing.*;
public class volOfCube {
    public static void main(String[] args) {
        //Initialize variables
        float len, volume;
        len = Float.parseFloat(JOptionPane.showInputDialog("Enter length of cube: "));

        volume = len*len*len;
        JOptionPane.showMessageDialog( null, "Volume of cube is: " +volume);
    }
    
}
