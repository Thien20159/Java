import java.awt.*;
import java.awt.event.*;

public class Demo1 extends Frame implements ItemListener {
	TextArea txtArea = new TextArea(8, 50); // 5 rows and 40 columns
	// CheckboxGroup g = new CheckboxGroup();
	Checkbox checkBox1 = new Checkbox("The First");
	Checkbox checkBox2 = new Checkbox("The Second");
	Checkbox checkBox3 = new Checkbox("Reset Checkbox");

	Demo1() {
		this.setTitle("My Checkbox Demo");
		this.setLayout(new BorderLayout());
		this.add(txtArea, BorderLayout.NORTH);
		Panel panel = new Panel();
		panel.setLayout(new FlowLayout());
		panel.add(checkBox1);
		panel.add(checkBox2);
		panel.add(checkBox3);
		this.add(panel, BorderLayout.SOUTH);
		checkBox1.addItemListener(this);
		checkBox2.addItemListener(this);
		checkBox3.addItemListener(this);
	}

	@SuppressWarnings("deprecation")
	public void itemStateChanged(ItemEvent evt) {
		if (evt.getStateChange() == ItemEvent.SELECTED) {
			String itemLabel = (String) evt.getItem();
			if (itemLabel == "The First") {
				txtArea.appendText("You checked " + itemLabel + "\n");
				System.out.println(itemLabel);
			}
			if (itemLabel == "The Second") {
				txtArea.appendText("You checked " + itemLabel + "\n");
				System.out.println(itemLabel);
			}
			if (itemLabel == "Reset Checkbox") {
				txtArea.setText("");
				System.out.println(itemLabel);
			}
		}
		if (evt.getStateChange() == ItemEvent.DESELECTED) {
			txtArea.appendText("You have just unchecked\n");
			System.out.println("You have just unchecked\n");
		}
	}

	public static void main(String[] arg) {
		Demo1 chkdemo = new Demo1();
		chkdemo.setSize(800, 600);
		chkdemo.setVisible(true);
	}
}
