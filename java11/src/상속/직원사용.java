package 상속;

import 복습.직원;

public class 직원사용 {

	public static void main(String[] args) {
		직원 work = new 직원(); //import가 안뜰때 f2
		work.name = "홍길동";  //name은 public 같은, 다른패키지에서 사용가능
//		work.address = "강남구"; //default 는 같은 패키지에서만 가능한데 다른 패키지라서 지금 안됨.
//		
//		work.salary = 100; //protected
		//==> 다른 패키지인 경우 상속관계에서만 됨.!
//		work.rrn = 111;
	}

}
