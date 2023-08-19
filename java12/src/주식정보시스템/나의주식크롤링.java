package 주식정보시스템;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 나의주식크롤링 {
//크롤링은 인터넷 문서(html)를 다 받아와서,
//html문서를 분석(parser, 파싱!)을 해서 내가 원하는 정보를 추출하는 것.
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 400);
		f.getContentPane().setBackground(Color.cyan);
		f.setLayout(new FlowLayout());
		Font font = new Font("궁서", Font.BOLD, 40);
		JButton b1 = new JButton("kb금융그룹");
		JButton b2 = new JButton("하나금융그룹");
		JButton b3 = new JButton("신한금융그룹");
		JButton b4 = new JButton("우리금융그룹");
		JButton name = new JButton();
		
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		b1.setBackground(Color.orange);
		b2.setBackground(Color.green);
		b3.setBackground(Color.blue);
		b4.setBackground(Color.red);
		
		
		JLabel label = new JLabel("CODE");
		label.setFont(font);
		
		JTextField text = new JTextField(7);
		text.setFont(font);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(label);
		f.add(text);
		f.add(b4);
		
		f.setVisible(true);
		
	}
}