package 생성자;

public class 은행통장사용하기 {

	public static void main(String[] args) {
		통장 적금통장 = new 통장("조창현", "960609", 10000);
		통장 주택청약 = new 통장("조창현", "960609", 20000);
//		System.out.println(적금통장.name);
//		System.out.println(적금통장.money);
//		
		System.out.println(적금통장); // toString()이 써있는 경우
		//주소가 아니고, 그 주소가 가르키는 멤버변수값을 프린트!
		System.out.println(주택청약);
	}

}
