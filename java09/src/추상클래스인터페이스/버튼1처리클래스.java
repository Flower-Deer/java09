package 추상클래스인터페이스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 버튼1처리클래스 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("b1 클릭함.");
	}

}
