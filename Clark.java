package day0629;

/**
 * 사람 클래스를 상속받아 사람의 공통기능(눈,코,입,이름,먹는일)을 사용하며
 * 자신 만의 특징(힘이 쎄다.)을 정의하는 클래스<br>
 * 힘의 레벨은 1~10까지 이며
 * 2는 일반인이다.<br>
 * final클래스이므로 자식 클래스를 가질 수 없다.(상속되지 않는 클래스)
 * @author USER
 */
public final class Clark extends Person implements Fly{
	public int power;
	
	/**
	 * 기본생성자 눈 2, 코 1, 입 1개가 설정되어 홍길동 클래스가 생성된다.
	 * 힘 레벨이 8로 설정된다.<br>
	 */
	public Clark() {
		super();
		power = 8;
	}
	
	/**
	 * 입력되는 돌의 종류에 따라 힘이 설정되는 일.
	 * @param stone 돌의 종류
	 * @return 결과
	 */
	public String power(String stone) {
		String result = "";
		if (stone.equals("크립토나이트")) {// 문자열 비교는 equals 사용.
			power = 1;
			result = "힘 빠짐....~(_._)~";
		}else if (stone.equals("다이아몬드")) {
			result = "감사합니다. ~(^^~)(~^^)~";
		}else {
			power = 14;
			result = "열받음. --+";
		}
		
		return result;
	}
	
	@Override
	public String eat() {
		return getName() + "가 집에서 빵을 안냥냥냥 먹는다.";
	}
	
	public String eat(String menu, int price) {
		return getName() + "가 식당에서 " + menu + "인 음식을 " + price + "$를 주고 사먹는다.";
	}

	@Override
	public String[] language() {
		String[] lang = {"영어","외계어"};
		return lang;
	}
	
	
	public String drivingForce(){
		return "추진력";
	}
	

	public String upwordForce(){
		return "양력";
	}
	

}
