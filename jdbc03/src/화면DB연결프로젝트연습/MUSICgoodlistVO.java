package 화면DB연결프로젝트연습;


//RAM에 만드는 저장공간을 만든다.
public class MUSICgoodlistVO {
	//MemberVO가방에 넣은 데이터는 Member테이블에 들어갈 예정
	//각 컬럼과 일치시켜줌
	

	private int MUSIC_ID;
	public int getMUSIC_ID() {
		return MUSIC_ID;
	}
	public void setMUSIC_ID(int mUSIC_ID) {
		MUSIC_ID = mUSIC_ID;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	@Override
	public String toString() {
		return "MUSICgoodlistVO [MUSIC_ID=" + MUSIC_ID + ", USER_ID=" + USER_ID + "]";
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	private String USER_ID;
	
	
	

	
	
}