package day0629;


/**
 * 추상클래스
 *
 * @author USER
 */
public abstract class AbstractParent {

	int i;
	
	public AbstractParent() {
		System.out.println("추상클래스의 생성자");
	}
	public void test() {
		System.out.println("일반 method");
	}
	
	// abstract method
	public abstract void abTest();
	public abstract void abTest(int i);
	
//	public static void main(String args[]) {
//		new AbstractParent(); //추상클래스는 객체화 되지 않는다.
//	}
}
