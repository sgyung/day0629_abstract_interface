package day0629;

/**
 * interface를 구현하는 클래스
 * interface내 abstract method를 모두 구현해야한다.
 * @author USER
 */
public class InterParentImple implements InterParent {

	@Override
	public void test() {
		System.out.println("Constant 사용 : " + InterParent.VALUE);
	}
	
	@Override
	public int test(String str) {
		return Integer.parseInt(str);
	}
	
	public static void main(String[] args) {
		// 인터페이스는 객체화가 되지 않는다.
		// InterParent ip = new InterParent(); 
		
		// is a 관계의 객체화는 가능
		InterParent ip = new InterParentImple();
		// ip객체로 사용할 수 있는 자원은 상수, Override된 method, default method
		ip.test();
		System.out.println(ip.test("100"));
		
		// default method호출
		System.out.println(ip.msg());
	
	}

}
