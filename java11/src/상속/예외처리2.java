package 상속;

import java.io.FileWriter;
import java.io.IOException;

public class 예외처리2 {

	public static void main(String[] args) {
		try {
			FileWriter file = new FileWriter("test.txt"); //test.txt로 파일을 만들어보겠다!!
			file.write("안녕\n");
			file.write("바이바이\n");
			file.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}

}
