package JOptionPane;
import javax.swing.*;

public class voting {
    public static void main(String[] args) {
        //Initialize variables
        int age;
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        if(age >= 18) {
            JOptionPane.showMessageDialog( null, "You are eligible for voting: " +age);
        }else{
            JOptionPane.showMessageDialog( null, "You are not eligible for voting: " +age);
        }
    }
    
}
