import java.awt.FlowLayout;

import javax.swing.JFrame;	//Thư viện hỗ trợ JFram của Swing
public class Demo2 {
    private JFrame f;				     //Khai báo JFrame
    public Demo2()
    {
            f=new JFrame("Demo JFrame");         //Tạo Jframe có tiêu đề
            f.setVisible(true);			      //Hiển thị 
            f.setLayout(new FlowLayout());	//Đặt cách bố trí các component
            f.setSize(500, 300);			//Kích thước JFrame
            f.setLocationRelativeTo(null);	//Hiện ở trung tâm màn hình
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     public static void main(String args[])
     {
         Demo2 demo=new Demo2();
     }
}

