package 배열응용;

import java.util.Random;

public class 우리반성적변동 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		Random r = new Random(42);
		
		int[] n1 = new int[500];
		int[] n2 = new int[500];
		
		for (int i = 0; i < n2.length; i++) {
			n1[i] = r.nextInt(101);
			n2[i] = r.nextInt(101);
		
		
		
		
	//	int[] n1 = {44, 66, 77, 22, 11};
	//	int[] n2 = {33, 55, 77, 20, 40};
		
		int count = 0; // 동일한 갯수 누적
		int count2 = 0; // 동일하지 않은 갯수 누적
		for (int j = 0; j < n2.length; j++) {
			System.out.println(n1[j] == n2[j]);
			if (n1[j] == n2[j]) {
				count++;
			}else {
				count2++;
			}
		}//for
		System.out.println("1-2학기 성적이 동일한 학생수>>" + count + "명");
		System.out.println("1-2학기 성적이 동일한 학생수>>" + count2 + "명");
		}
		
		
		
		
		
		
		
		//2학기에 성적이 더 오른 학생은 몇명?? 누구??
		//1학기에 성적이 더 좋았던 학생은 몇명? 누구????
	
		
		
		
		
		
		
		
	}	

}
