import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GameScreen extends JPanel implements Runnable{

	int a = 0;
	int b = 700;
	Thread thread;
	// ham khoi tao
	public GameScreen() {
		thread = new Thread(this);
		thread.start();
	}

	// ham co san cua JPanel
	public void paint(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(0, 0, 700, 500);
		g.setColor(Color.red);
		g.fillRect(a, 10, 50, 50);
		g.setColor(Color.blue);
		g.fillRect(b, 10, 50, 50);
	}

	public void run() {
		while (true) {
			a+=1;
			b--;
			repaint();
			try {
				thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}