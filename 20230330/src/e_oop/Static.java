package e_oop;

public class Static {
	
	/*
	 * - static을 붙이면 프로그램 실행 시 메모리에 올라간다.
	 * - 객체생성을 하지 않아도 사용할 수 있다.
	 * - static을 붙인 변수는 객체간에 변수의 값을 공유한다.
	 * - static이 붙은 멤버의 명칭 : 클래스 변수, 클래스 메서드
	 * - static이 붙지 않은 멤버의 명칭 : 인스턴스 변수, 인스턴스 메서드
	 */
	
	static int var;
	
	public static void main(String[] args) {
		
		Human 태웅 = new Human();
		Human 소연 = new Human();
		
		태웅.savemoney(100000);
		소연.savemoney(200000);
		//각각의 통장잔고
		태웅.saveDateMoney(200000);
		소연.saveDateMoney(200000);
		//클래스 변수로 선언하였기 때문에 더해진다.
		
		
	}

}

class Human {
	int account;
	
	//메서드 선언 ==> 반환타입 메서드명() {  };
	void savemoney(int money) {
		account += money;
		System.out.println("통잔잔고 : " + account);
	}
	
	static int dateAccount;
	
	void saveDateMoney(int money) {
		dateAccount += money;
		System.out.println("데이트 통장 잔고 : " + dateAccount);
	}
}














