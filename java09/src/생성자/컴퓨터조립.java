package 생성자;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		컴퓨터 com1 = new 컴퓨터(300000, "dell", 40);
		컴퓨터 com2 = new 컴퓨터(500000, "samsung", 42);
//		System.out.println(적금통장.name);
//		System.out.println(적금통장.money);
//		
		System.out.println(com1); // toString()이 써있는 경우
		//주소가 아니고, 그 주소가 가르키는 멤버변수값을 프린트!
		System.out.println(com2);
	}

}
