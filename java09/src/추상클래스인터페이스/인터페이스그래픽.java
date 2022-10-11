package 추상클래스인터페이스;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;

public class 인터페이스그래픽 {
	static JButton b1,b2;
	static JTextArea area;
	public static void main(String[] args) {
		JFrame f = new JFrame("이벤트를 인터페이스로 처리");
		f.setSize(500,500);
		f.setLayout(new FlowLayout());
		
		b1 = new JButton("나를 눌러요.");
		b2 = new JButton("나도 눌러요.");
		
		버튼1처리클래스 act1 = new 버튼1처리클래스();
		버튼2처리클래스 act2 = new 버튼2처리클래스();
		
		b1.addActionListener(act1);
		b2.addActionListener(act2);
		
		f.add(b1); //업캐스팅(자동형변환)
		f.add(b2);
		
		Font font = new Font("궁서", Font.BOLD, 50);
		b1.setFont(font);
		b2.setFont(font);
		
		area = new JTextArea(6,13);
		area.setFont(font);
		f.add(area);
		
		area.setBackground(Color.yellow);
		
		f.setVisible(true);
	}
//	public void actionPerformed(ActionEvent e) { 
//		if (e.getSource() == b1) {
//			list.append("b1버튼을 클릭함" + "\n");
//		}
//		if (e.getSource() == b2) {
//			list.append("b2버튼을 클릭함" + "\n");
//		}
//	}

}
