package 추상클래스인터페이스;

// 인터페이스 -> 클래스로 만들때 반드시 있어야하는 기능에 대한 조건명시
public interface MyAction {
	
	// abstract : 추상적인, 불완전
	public abstract void click(); //추상메서드 : 처리하는 내용X
	void dbClick(); //  public abstract 생략가능
	// 일반변수 사용 불가능 , 공유할 목적으로 만든 상수만 가능!!
	
	
}
