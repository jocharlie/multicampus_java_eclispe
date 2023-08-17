package 연습문제;

public class 딸 {
	String name;
	String gender;
	static int money = 10000;
	static int count;
	
	public 딸(String name, String gender) {
		count++;
		money = money - 1000;
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}
}