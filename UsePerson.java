package day0629;

import homework.KimSeonKyung;

public class UsePerson { // 클래스들의 설명서 -> Java doc = API doc
							// File -> Export -> Java -> java doc -> doc주소 만들 패키지 선택 -> next -> next -> VM
							// option에 -locale ko_KR -encoding UTF-8 -charset UTF-8 -docencoding UTF-8 입력
							// -locale ko_KR -encoding UTF-8 -charset UTF-8 -docencoding UTF-8 -> API doc 주소
							// 만들기
	/**
	 * Java Application <- (main method를 가지고 있는 class)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 객체 생성
		HongGilDong hgd = new HongGilDong();
		
		// 코드의 재사용성 : 부모의 method를 자식에서 자신의 것처럼 사용.
		hgd.setName("홍길동");
		System.out.printf("눈 : %d, 코 : %d, 입 : %d, 이름 : %s\n",
				hgd.getEye(), hgd.getNose(), hgd.getMouth(), hgd.getName());
	
		System.out.println(hgd.eat());
		System.out.println(hgd.eat("뜨끈한 국밥", 40));// 국밥은 한그릇에 40푼
		
		// 자신만의 특징
		System.out.println(hgd.fight(5)); // 6 -> 7
		System.out.println(hgd.fight(6)); // 7 -> 8
		System.out.println(hgd.fight(8)); // 8
		System.out.println(hgd.fight(9)); // 8 -> 7
		System.out.println(hgd.fight(7)); // 7
		
		System.out.println("===========================================================");
		
		Clark superman = new Clark();
		// 코드의 재사용성 : 부모의 method를 자식에서 자신의 것처럼 사용.
		superman.setName("클락 켄트");
		System.out.printf("눈 : %d, 코 : %d, 입 : %d, 이름 : %s\n",
				superman.getEye(), superman.getNose(), superman.getMouth(), superman.getName());
		
		System.out.println(superman.eat());
		System.out.println(superman.eat("스테이크", 10));// 스테이크는 10$
		
		//자신만의 특징
		String stone = "크립토나이트";
		System.out.println(stone + "는 " + superman.power(stone));
		
		stone = "다이아몬드";
		System.out.println(stone + "는 " + superman.power(stone));
		
		stone ="짱돌";
		System.out.println(stone + "은 " + superman.power(stone));
		System.out.println("===========================================================");
		
		KimSeonKyung ksg = new KimSeonKyung();
		ksg.setName("김선경");
		System.out.printf("눈 : %d, 코 : %d, 입 : %d, 이름 : %s\n",
				ksg.getEye(), ksg.getNose(), ksg.getMouth(), ksg.getName());
		
		System.out.println(ksg.investment(-7.2));
		System.out.println(ksg.investment(0));
		System.out.println(ksg.investment(8));
		System.out.println("===========================================================");

		String[] lang = hgd.language();
		System.out.println(hgd.getName() + "이 구사할 수 있는 언어");
		for (int i = 0; i < lang.length; i++) {
			System.out.printf("%s\t", lang[i]);
		}
		System.out.println();
		System.out.println("===========================================================");
		// 클락이 구사할 수 있는 언어를 개선된 for를 사용하여 출력
		String[] clarkLang = superman.language();
		System.out.println(superman.getName() + "이 구사할 수 있는 언어");
		for(String lang1 : clarkLang) {
			System.out.println(lang1);
		}
		System.out.println("===========================================================");
		
		System.out.println(superman.drivingForce());
		System.out.println(superman.upwordForce());
	}

}
