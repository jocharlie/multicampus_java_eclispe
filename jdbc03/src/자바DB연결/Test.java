package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Test {
      
	public static void main(String[] args) {
	String s = JOptionPane.showInputDialog("이름입력"); //창을 띄어준다 --> 입력(홍길동) -->가져다 줌.
	//Connection con = DriverManager.getConnection("", "", ""); //url에 연결하고 --> 인증을 함 --> 커넥션을 만들어준다. Conn
}

}