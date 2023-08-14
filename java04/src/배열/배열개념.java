package 배열;

public class 배열개념 {

	public static void main(String[] args) {
		// 여러개의 데이터를 램에 저장해두고 cpu가 접근하여 사용하고
		// 싶은 경우 사용하는 부품
		// 1. 값을 이미 알고 있는 경우
//		int[] jumsu = {10, 20, 30, 40}; //length 만들어서 몇개인지 세서 값을 넣어줌.
//		System.out.println(jumsu);
///		System.out.println(jumsu[0]);
//		System.out.println(jumsu[1]);
//		System.out.println(jumsu[2]);
//		System.out.println(jumsu[3]);
//		System.out.println(jumsu.length);
//		jumsu[0] = 100;
//		System.out.println(jumsu[0]);
		
		// 2. 값을 아직 모르고 있는데, 먼저 저장공간 만들어두고
		// 나중에 값을 넣는 경우
	//	int[] jumsu2 = new int[4];
	//	jumsu2[0] = 200;
	//	System.out.println(jumsu2[0]);
		//1
		int[] week = {1,2,3,4,5,6,7,8};
		//2
		System.out.println(week[0]);
		System.out.println(week[1]);
		//3
		System.out.println(week.length);
		//4
		week[2] = 10;
		week[4] = 12;
		//5
		System.out.println(week[2]);
		System.out.println(week[4]);
		
		//6
		
		int[] tour = new int[4];
		
		//7
		tour[0] = 20;
		tour[2] = 30;
		System.out.println(tour[0]);
		System.out.println(tour[2]);
		System.out.println(tour.length);
		
	}

}
