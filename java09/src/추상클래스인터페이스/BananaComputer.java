package 추상클래스인터페이스;

public class BananaComputer implements Computer {

	@Override
	public void 컴퓨터는데스크탑을사용합니다() {
		System.out.println("바나나사 데스크탑을 사용해야 합니다.");
	}

	@Override
	public void 플러그를반드시꽂아야합니다() {
		System.out.println("사용을 위해 반드시 플러그를 꽂아야 합니다.");
	}

	@Override
	public void 모니터가있어야합니다() {
		System.out.println("바나나사 모니터가 있어야 합니다.");
	}

}
