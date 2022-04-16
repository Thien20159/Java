import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Demo6 extends JFrame implements MouseListener, MouseMotionListener {
	private JTextArea txtHienThi;
	private JPanel p1, p2, p3;
	private JMenu fi, ed, ed3;
	private JMenuBar mbar;
	private JMenuItem ed1, ed2, ed4, demoMouse;

	public Demo6() {
		super("Ngôn ngữ lập trình");
		setSize(400, 500);
		setVisible(true);	
		txtHienThi = new JTextArea("Hiển thị kết quả Demo");
		GUI(); // xây dựng giao diện
		menu(); // xây dựng menu
				// lắng nghe sự kiện chuột trên frame
		addMouseListener(this);
		addMouseMotionListener(this);

		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String args[]) {
		Demo7 demo = new Demo7();
	}

	public void GUI() {
		// tao 3 panel, frame chứa p1 và p2, p2 chứa p3 và textArea
		p1 = new JPanel();
		p2 = new JPanel(new BorderLayout());
		p3 = new JPanel(new GridLayout(6, 1));
		p1.setPreferredSize(new Dimension(400, 170));
		p2.setPreferredSize(new Dimension(400, 330));
		p3.setPreferredSize(new Dimension(120, 330));
		p1.setBackground(Color.MAGENTA);
		p3.add(new JLabel("Ngôn ngữ", SwingConstants.CENTER));
		p3.add(new JButton("Java"));
		p3.add(new JButton("Python"));
		p3.add(new JButton("C++"));
		p3.add(new JButton("C#"));
		p3.add(new JButton("C"));
		// gọi xử lý sự kiện click button ở đây…
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		p2.add(p3, BorderLayout.WEST);
		p2.add(txtHienThi);
	}

	public void menu() {
		mbar = new JMenuBar();
		fi = new JMenu("Giới thiệu");
		ed = new JMenu("Demo");
		ed1 = new JMenuItem("C");
		ed2 = new JMenuItem("C#");
		ed3 = new JMenu("Java");
		demoMouse = new JMenuItem("Giao diện với Swing");
		ed4 = new JMenuItem("Python");
		mbar.add(fi);
		mbar.add(ed);
		fi.add(ed1);
		fi.add(ed2);
		ed.add(ed3);
		ed.add(ed4);
		ed3.add(demoMouse);

		add(mbar, BorderLayout.PAGE_START);
		// gọi xử lý sự kiện click menu ở đây…
	}

	// handle event when mouse released immediately after press
	public void mouseClicked(MouseEvent event) {
		txtHienThi.setText("Clicked at [" + event.getX() + event.getY() + "]");
	}

	// handle event when mouse press
	public void mousePressed(MouseEvent event) {
		txtHienThi.setText("Pressed at [" + event.getX() + event.getY() + "]");
	}

	// handle event when mouse released after dragging
	public void mouseReleased(MouseEvent event) {
		txtHienThi.setText("Released at [" + event.getX() + event.getY() + "]");
	}

	// handle event when mouse enter area
	public void mouseEntered(MouseEvent event) {
		txtHienThi.setText("Mouse  entered at [" + event.getX() + event.getY() + "]");
		getContentPane().setBackground(Color.GREEN);
	}

	// handle event when mouse exit area
	public void mouseExited(MouseEvent event) {
		txtHienThi.setText("Mouse out side window");
		getContentPane().setBackground(Color.WHITE);
	}

	// MouseMotionListener event handlers
	// handle event when user drags mouse with button pressed
	public void mouseDragged(MouseEvent event) {
		txtHienThi.setText("Dragged at [" + event.getX() + event.getY() + "]");
	}

	// handle event when user moves mouse
	public void mouseMoved(MouseEvent event) {
		txtHienThi.setText("Moved at [" + event.getX() + event.getY() + "]");
	}
}
