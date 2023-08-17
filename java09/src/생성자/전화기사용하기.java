package 생성자;



public class 전화기사용하기 {

	public static void main(String[] args) {
		//전화기를 만들어보자. 2개를 만들어보자.
		
		전화기 p1 = new 전화기();
		//퍼블릭을 붙여주지 않으면 안보인다....!!!!!!!!!!!! 퍼블릭은 다른패키지에서도 아무곳이나 접근가능하다. 접근제어자
		
		p1.price = 1000;
		p1.shape = "폴더";
		p1.인터넷하다();
		System.out.println("p1의 가격" + p1.price);
		System.out.println("p1의 가격" + p1.shape);
		
		
		전화기 p2 = new 전화기();
		p2.price = 1000;
		p2.shape = "네모";
		p2.카톡하다();
		System.out.println("p2의 가격" + p2.price);
		System.out.println("p2의 가격" + p2.shape);
	}
}
