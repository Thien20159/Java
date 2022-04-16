import java.awt.FlowLayout;
import javax.swing.JFrame; //Thư viện hỗ trợ JFram của Swing

public class Demo3 extends JFrame {
	public Demo3() {
		super("Demo JFrame"); // đặt tiêu đề
		setVisible(true); // Hiển thị
		setLayout(new FlowLayout()); // Đặt cách bố trí các component
		setSize(300, 100); // Kích thước JFrame
		setLocationRelativeTo(null); // Hiện ở trung tâm màn hình
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		Demo3 demo = new Demo3();
	}
}
