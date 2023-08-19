package 인터페이스;

public class AppleComputer implements computer {

	@Override
	public void 마우스를연결하다() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터에 마우스를 연결하다.");
	}

	@Override
	public void 인터넷을접속하다() {
		// TODO Auto-generated method stub
		System.out.println("구글크롬으로 인터넷에 접속하다.");
	}

	@Override
	public void 지뢰찾기를게임하다() {
		// TODO Auto-generated method stub
		System.out.println("심심해서 지뢰찾기를게임하다.");
	}


}