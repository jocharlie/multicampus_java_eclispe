package 배열;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. int크기 5인 배열을 생성해보세요.
		int[] hi = new int[5];
		//	jumsu2[0] = 200;
		//	System.out.println(jumsu2[0]);
		//2. 배열의 크기를 프린트 해보세요.
		System.out.println(hi.length);
		//3. 배열의 첫번째 위치에 100을 넣어서, 프린트해보세요.
		hi[0] = 100;
		System.out.println(hi[0]);
		//4. 배열의 마지막번째 위치에 500을 넣어서, 프린트해보세요.
		hi[4] = 500;
		System.out.println(hi[4]);
		//5. 배열의 세번째 위치에 200을 넣어서, 프린트해보세요.
		hi[2] = 200;
		System.out.println(hi[2]);
		//6. 배열의 전체 데이터를 프린트.
		for (int i = 0; i < hi.length; i++) {
			System.out.println(hi[i]);
		}
		//7. 배열의 전체 데이터를 인덱스와 함께 프린트.
		for (int i = 0; i < hi.length; i++) {
			System.out.println(i + ":" + hi[i]);
		}
		//8. 그림으로 그려보세요.
		
	}

}
