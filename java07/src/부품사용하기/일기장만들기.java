package 부품사용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 일기장만들기 {

	public static void main(String[] args) {
		//font, flowlayout
		//jframe, imageicon3개, imagelabel
		//idlabel, pwlabel, id입력값, pw입력값
		//로그인버튼, reset버튼
		JFrame f = new JFrame();
		f.setTitle("내 일기장 로그인");
		f.setSize(500, 600);
		f.getContentPane().setBackground(Color.green);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("궁서", 1, 30);
		
		JLabel top = new JLabel();
		JLabel id = new JLabel("아  이  디 : ");
		JLabel pw = new JLabel("패 스 워 드 : ");
		id.setFont(font);
		pw.setFont(font);
		
		ImageIcon icon1 = new ImageIcon("diary.png");
		ImageIcon icon2 = new ImageIcon("id.png");
		ImageIcon icon3 = new ImageIcon("pw.png");
		top.setIcon(icon1);
		
		JTextField idText = new JTextField(10);
		JTextField pwText = new JTextField(10);
		idText.setFont(font);
		pwText.setFont(font);
		
		JButton login = new JButton();
		JButton reset = new JButton();
		login.setIcon(icon2);
		reset.setIcon(icon3);
		login.setBackground(Color.GREEN);
		reset.setBackground(Color.GREEN);
		
		f.add(top);
		f.add(id); f.add(idText);
		f.add(pw); f.add(pwText);
		f.add(login); f.add(reset);
		
		f.setVisible(true);

	}

}