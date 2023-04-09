package e_oop.idolGame;

public class Company {
	
	String comName;
	int level;
	static long commoney;
	
	
	Company(String comName) {
		this.comName = comName;
		level = 1;
		commoney = 1000000;
	}



	public void companyInfo() {
		System.out.println("----------------------회사 상황---------------------");
		System.out.println("회사명 : " + comName);
		System.out.println("레벨 : " + level);
		System.out.println("자산 : " + commoney + "원");
		System.out.println("-------------------------------------------------");
		
	}

	
	
}
