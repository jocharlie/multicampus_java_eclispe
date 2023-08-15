package 복습;

public class 배열만들기 {

	public static void main(String[] args) {
		//1. 배열 만들기- 이미 값을 알고 있는 경우
		
		String[] country = { "대한민국", "우루과이", "포르투갈", "가나" };
			System.out.println(country);
			System.out.println("0: " + country[0]);
			System.out.println("1: " + country[1]);
			System.out.println(country.length);
			System.out.println(country[country.length-1]);
			//c타입의 for문
			for (int i = 0; i < country.length; i++) {
				//i == > index의 역할, 0,1,2
				System.out.println(i + ": " + country[i]);
			}
		
			
			
			// java에서는 출력용!!
			//for each문: 알아서 처음부터 인덱스를 하나씩 증가하면서 하나씩 꺼내온다.
			for (String x : country ) {
				System.out.println(x);
				
			}
		
		//2. 배열 만들기- 값을 모르고 있는 경우, 공간부터 만들자!!!!!!!!!!
		String[] job = new String[5];
		System.out.println(job);
		job[0] = "백엔드 프로그래머";
		job[1] = "카페주인";
		System.out.println(job[0]);
		System.out.println(job[1]);
		System.out.println(job[4]);
		for (int i = 0; i < job.length; i++) {
			//i == > index의 역할, 0,1,2
			System.out.println(i + ": " + job[i]);
		}
		for (String x : job) {
			System.out.println(x);
			
		}
	}

}
