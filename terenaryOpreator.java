package JOptionPane;
import javax.swing.*;

public class terenaryOpreator {
    public static void main(String[] args) {
        //Intialize variables
        int age;
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        String result = (age >= 18) ? "You are eligible for voting." : "You are below 18.";
		System.out.println(result);
    }
}
