package 인터페이스;

public class BananaComputer implements computer {

	@Override
	public void 마우스를연결하다() {
		// TODO Auto-generated method stub
		System.out.println("노트북에 마우스를 연결하다.");
	}

	@Override
	public void 인터넷을접속하다() {
		// TODO Auto-generated method stub
		System.out.println("네이버웨일로 인터넷을 접속하다.");
	}

	@Override
	public void 지뢰찾기를게임하다() {
		// TODO Auto-generated method stub
		System.out.println("쉬는시간에 지뢰찾기를 게임하다.");
	}


}