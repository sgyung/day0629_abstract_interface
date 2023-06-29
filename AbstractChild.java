package day0629;

/**
 * 추상클래스의 자식 클래스<br>
 * 구현의 강제성.
 * 자식클래스는 부모클래스의 abstract method가 몇개든 모두 구현해야한다.
 * @author USER
 */
public class AbstractChild extends AbstractParent{
	
	public AbstractChild() {
		System.out.println("자식의 생성자");
	}
	
	@Override
	public void abTest(){
		// abstract method는 직접 호출불가
//		super.abTest();
		System.out.println("자식의 Override한 abTest");
	}
	
	@Override
	public void abTest(int i){
		System.out.println("자식이 Override한 abTest i = " + i);
	}
	
	public static void main(String[] args) {
		// 추상클래스는 자식클래스가 생성될때에만 객체로 생성된다.
		AbstractChild ac = new AbstractChild();
		// is a 관계의 객체화
		AbstractParent ap = new AbstractChild();
		
		ac.abTest();
		ap.abTest();
		System.out.println("=======================================");
		ac.abTest(10);
		ap.abTest(20);
		
	}

}
