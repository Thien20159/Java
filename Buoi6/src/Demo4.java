import java.awt.*;
import javax.swing.*;

public class Demo4 {
	public Demo4() {
		JFrame f = new JFrame("Demo FlowLayout");
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.add(new JButton("Red"));
		f.add(new JButton("Green"));
		f.add(new JButton("Blue"));
		String[] ds = { "Bold", "Italic", "UnderLine" };
        JComboBox cbo=new JComboBox(ds);
		f.add(cbo);
		f.add(new JCheckBox("Pick me", true));
		f.add(new JLabel("Enter your name"));
		f.add(new JTextField(20));
		f.pack();
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		Demo4 demo = new Demo4();
	}
}
