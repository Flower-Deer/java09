package 추상클래스인터페이스;

// 액션처리 클래스는 MyAction 에 정의된 기능을 구현해서 만들겠다라는 의미
public class 액션처리클래스 implements MyAction{

	@Override
	public void click() {
		System.out.println("클릭하면 인터넷으로 연결하는 처리...");
	}

	@Override
	public void dbClick() {
		System.out.println("더블클릭하면 화면을 닫는 처리...구현..");
	}

}
