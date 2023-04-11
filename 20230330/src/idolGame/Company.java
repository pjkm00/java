package idolGame;

public class Company {
	
	static String comName;
	int level;
	static long commoney;
	static int day = 1;
	
	
	Company(String cName) {
		comName = cName;
		level = 1;
		commoney = 100000;
	}



	public void companyInfo() {
		System.out.println("----------------------회사 상황---------------------");
		System.out.println("회사명 : " + comName);
//		System.out.println("레벨 : " + level);
		System.out.println("자산 : " + commoney + "원");
		System.out.println("-------------------------------------------------");
		
	}

	
	
}
