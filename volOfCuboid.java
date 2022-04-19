package JOptionPane;
import javax.swing.* ;

public class volOfCuboid {
    public static void main(String[] args) {
        float length, width, height, volume;
        length = Float.parseFloat(JOptionPane.showInputDialog("Enter length of cuboid: "));
        width = Float.parseFloat(JOptionPane.showInputDialog("Enter width of cuboid: "));
        height = Float.parseFloat(JOptionPane.showInputDialog("Enter height of cuboid: "));

        volume = length*width*height;

        JOptionPane.showMessageDialog( null, "Volume of cuboid is: " +volume);
        
    }
    
}
