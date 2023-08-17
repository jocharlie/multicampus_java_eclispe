package 상속기본;

public class 볼펜 extends 학용품 {
	//price, company가 있는것과 마찬가지
	
	
	int size;
	//buy()
	public void write() {
		System.out.println("글을쓰다");
	}
	@Override
	public String toString() {
		return "볼펜 [size=" + size + ", price=" + price + ", company=" + company + "]";
	}

}
