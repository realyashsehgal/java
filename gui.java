import java.awt.Color;
import java.awt.Dialog;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class gui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Please enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Please enter your hright"));
        JOptionPane.showMessageDialog(null, "your name is " + name +"\nyour height is " + height+"\nyour age is " + age);
        JLabel label = new JLabel("idk what is this");
        label.setBackground(Color.BLUE);
        JOptionPane.showMessageDialog(label,label);
        
    }

}
