package JOptionPane;
import javax.swing.*;

public class simpleInterest {
    public static void main(String[] args) {
        //intialize variables
        float Principle, time, rate, si;
        Principle = Float.parseFloat(JOptionPane.showInputDialog("Enter Principle amount: "));
        time = Float.parseFloat(JOptionPane.showInputDialog("Enter time period: "));
        rate= Float.parseFloat(JOptionPane.showInputDialog("Enter rate of interest: "));

        si = Principle*time*rate/100;
        JOptionPane.showMessageDialog( null, "Interest Amount: " +si);
    }
    
}
