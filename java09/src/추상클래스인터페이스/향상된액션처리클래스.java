package 추상클래스인터페이스;

public class 향상된액션처리클래스 implements MyAction {

	@Override
	public void click() {
		System.out.println("보안이 강화된 상태로 인터넷으로 연결 처리...구현..");
	}

	@Override
	public void dbClick() {
		System.out.println("화면에 경고메시지를 띄운 후, 화면을 닫는 처리...구현..");
	}

}
