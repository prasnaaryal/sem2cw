package JOptionPane;
import javax.swing.*;

public class percentageCal {
    public static void main(String[] args) {
        //initialize variables
        float sub1, sub2, sub3, sub4, percent, marksObt;
        sub1 = Float.parseFloat(JOptionPane.showInputDialog("Enter sub1 mark: "));
        sub2 = Float.parseFloat(JOptionPane.showInputDialog("Enter sub2 mark: "));
        sub3 = Float.parseFloat(JOptionPane.showInputDialog("Enter sub3 mark: "));
        sub4 = Float.parseFloat(JOptionPane.showInputDialog("Enter sub4 mark: "));
        marksObt = sub1+sub2+sub3+sub4;
        percent = marksObt/400 * 100;

        if (percent >=70){
            JOptionPane.showMessageDialog( null, "You passed with 1st class   " +percent);
        }else if(percent >= 59){
            JOptionPane.showMessageDialog( null, "You passed with upper second class   " +percent);
        }else if(percent >= 49){
            JOptionPane.showMessageDialog( null, "You passed with second class   " +percent);
        }else{
            JOptionPane.showMessageDialog( null, "You passed with 3rd class   " +percent);
            JOptionPane.showMessageDialog( null, "You Failed!!   " +percent);
        }
        
    }
    
}
