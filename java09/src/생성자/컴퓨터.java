package 생성자;

public class 컴퓨터 {

	String name; // 컴터회사 이름
	int inch; // 화면인치
	int money; //돈
	
	

	public 컴퓨터(int money , String name , int inch ) {
		
		this.money = money;
		this.name = name;
		this.inch = inch;
		
	}

	
	
	
	
	
	@Override
	public String toString() {
		return "컴퓨터 [money=" + money + ", name=" + name + ", inch=" + inch + "]";
	}
	
	
	
	
}
