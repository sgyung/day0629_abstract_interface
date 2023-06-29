package day0629;

/**
 * inner class : 안쪽클래스를 인스턴스 변수처럼 사용할 때.
 * @author USER
 */
public class Outter {
	
	int out_i;
			
	public Outter() {
		System.out.println("외부 클래스의 생성자");
	}
	public void OutMethod() {
		System.out.println("바깥 클래스의 method");
		// 바깥 클래스에서는 내부 클래스의 자원을 직접 접근할 수 없다.
		//in_i = 100;
		//inMethod();
		
		// 안쪽클래스를 객체화
		// 바깥클래스명.안쪽클래스명 객체명 = 바깥클래스의 객체명.new 안쪽클래스의생성자();
//		Outter.Inner in = this.new Inner();
//		Inner in = this.new Inner();// 바깥클래스명 생략
		Inner in = new Inner();// this 생략
		
		in.in_i = 100;// 안쪽클래스의 자원 사용가능
		in.inMethod();// 
	}
	
	//////////////////////inner class 시작/////////////////////////////////////
	public class Inner{
		int in_i;
		public Inner() {
			System.out.println("내부클래스의 생성자");
		}
		public void inMethod() {
			System.out.println("내부클래스의 method");
			// 외부클래스의 변수나 method는 직접 접근이 가능
			out_i=100;
			//OutMethod();
		}
	}
	
	//////////////////////inner class 끝/////////////////////////////////////
	
	public static void main(String[] args) {
		// 1.외부클래스를 객체화
		Outter out = new Outter();
		out.OutMethod();
		// 2.내부클래스의 객체화
		//Outter.Inner in = out.new Inner();
	}

}
