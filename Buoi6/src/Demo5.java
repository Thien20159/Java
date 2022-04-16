import java.awt.*;
import javax.swing.*;

public class Demo5 {
	public Demo5() { // tạo JFrame
		JFrame f = new JFrame("Đăng nhập");
		f.setSize(300, 200);
		JPanel pUsername = new JPanel();
		JLabel userName = new JLabel("User name");
		JTextField name = new JTextField(15);
		pUsername.add(userName);
		pUsername.add(name);
		JPanel pPass = new JPanel();
		JLabel pass = new JLabel("Pass word");
		JPasswordField pa = new JPasswordField(15);
		pPass.add(pass);
		pPass.add(pa);
		JButton login = new JButton("Login");
		login.setFocusable(false);
		JLabel title = new JLabel("ĐĂNG NHẬP", SwingConstants.CENTER);
		JPanel pLogin = new JPanel();
		pLogin.setLayout(new BoxLayout(pLogin, BoxLayout.PAGE_AXIS));
		pLogin.add(title);
		pLogin.add(pUsername);
		pLogin.add(pPass);
		pLogin.add(login);
		f.add(pLogin);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		Demo5 vd = new Demo5();
	}
}
