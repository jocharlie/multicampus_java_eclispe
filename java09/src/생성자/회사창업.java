package 생성자;

public class 회사창업 {

	public static void main(String[] args) {
		직원 직원1 = new 직원("홍길동", 25, "여");
		직원 직원2 = new 직원("김길동", 24, "남");
		직원 직원3 = new 직원("송길동", 26, "여");
		
		System.out.println(직원.count);
		System.out.println(직원1);
		System.out.println(직원2);
		System.out.println(직원3);
		System.out.println(직원.sum / (double)직원.count);
		
	}

}
	
