package 화면DB연결프로젝트연습;


//RAM에 만드는 저장공간을 만든다.
public class MUSICBUYVO {
	//MemberVO가방에 넣은 데이터는 Member테이블에 들어갈 예정
	//각 컬럼과 일치시켜줌
	//하나의 변수당 set/get하나씩 만들어줌.
	//가방에 하나씩 값을 넣어주어야 함. ==>setter
	private String HEART;
	private String BUY;
	private String MUSIC_ID;
	private String USER_ID;
	
	public String getMUSIC_ID() {
		return MUSIC_ID;
	}
	public void setMUSIC_ID(String mUSIC_ID) {
		MUSIC_ID = mUSIC_ID;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getHEART() {
		return HEART;
	}
	public void setHEART(String hEART) {
		HEART = hEART;
	}
	public String getBUY() {
		return BUY;
	}
	public void setBUY(String bUY) {
		BUY = bUY;
	}
	
	@Override
	public String toString() {
		return "MUSICBUYVO [MUSIC_ID=" + MUSIC_ID + ", USER_ID=" + USER_ID + ", HEART=" + HEART + ", BUY=" + BUY + "]";
	}
	
	

	
	
}
