package 복습;

public class 직원사용 {

	public static void main(String[] args) {
		직원 work = new 직원();
		work.name = "홍길동";  //name은 public 같은, 다른패키지에서 사용가능
		work.address = "강남구";  //default
		work.salary = 100; //protected

	}

}
