package day0629;

/**
 * 인터페이스는 상수와 추상 메소드로 이루어져 있다.
 * @author USER
 */
public interface InterParent {
//	int i; // instance변수를 선언 할 수 없다.
//	public InterParent() {// 생성자를 선언할 수 없다. => 객체화 안됨
//	}
	
//	public void test() {// 일반 method를 선언할 수 없다. => 일을 할 수 없음.
//	}
	
	public static final int VALUE = 10;
	
	public void test(); // abstract이 없어도 abstract method
	public abstract int test(String str);
	
	//default는 JDK1.8에서부터 추가된 method
	public default String msg() {
		String msg = "오늘은 목요일 입니다.";
		return msg;
	}
}
