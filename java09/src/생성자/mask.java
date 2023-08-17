package 생성자;

public class mask {

	String color; // 마스크색깔

	int money; //돈
	int how; // 화면인치
	
	
	public mask(String color, int money ,int how) {
		super();
		this.color = color;
		this.money = money;
		this.how = how;
		
	}
	
	@Override
	public String toString() {
		return "mask [color=" + color + ", money=" + money + ", how=" + how + "]";
	}
}
