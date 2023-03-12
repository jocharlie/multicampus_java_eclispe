package 화면DB연결프로젝트연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import 자바DB연결.MemberDAO3;

public class MUSICUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("음악 홈페이지 로그인 화면");
		f.setSize(600, 500);
		
		JButton b1 = new JButton("Login");
		JButton b3 = new JButton("계정관리");
		JButton b4 = new JButton("로그인");
		
		
		JLabel l1 = new JLabel("<<<< 로그인화면 >>>>");
		JLabel l2 = new JLabel("아이디");
		JLabel l3 = new JLabel("패스워드");
		
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		
		
	
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원가입처리");
				String id = t1.getText();
				String pw = t2.getText();
				
				
				if(id.equals("")) { //기본형 4가지만 == 로 값을 비교 가능! 
					JOptionPane.showMessageDialog(f, "id는 필수입력항목입니다.");
				}
				MemberDAO3 dao = new MemberDAO3();
				
				//1. 가방을 만들어주세요. 
				MemberVO bag = new MemberVO();
				//2. 가방에 값들을 넣어주세요.
				bag.setId(id);
				bag.setPw(pw);
				
				//3. 값들이 들어있는 가방을 전달하자. 
				int result = dao.insert(bag);//1 or 0
				
				if(result == 1) {
					JOptionPane.showMessageDialog(f, "회원가입 성공");
				}else {
					JOptionPane.showMessageDialog(f, "회원가입 실패, 재입력해주세요.");
				}
			}//action
		}); //b1
		
		//탈퇴기능 
//		b2.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("회원탈퇴처리");
//				String id = t1.getText();
//				
//				MemberDAO3 dao = new MemberDAO3();
//				int result = dao.delete(id);
//				if(result == 1) {
//					JOptionPane.showMessageDialog(f, "회원탈퇴 성공");
//				}else {
//					JOptionPane.showMessageDialog(f, "회원탈퇴 실패, 재입력해주세요.");
//				}
//			}//action
//		}); //b2
		
//		//수정기능 
//		b3.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("회원수정처리");
//				String id = t1.getText(); //조건 
//				String tel = t4.getText(); //바꾸는 항목 
//				
//				MemberDAO3 dao = new MemberDAO3();
//				//1. 가방을 만들자. 
//				MemberVO bag = new MemberVO();
//				//2. 가방에 값을 넣자.
//				bag.setId(id);
//				bag.setTel(tel);
//				//3. 가방을 전달하자.
//				int result = dao.update(bag);
//				if(result == 1) {
//					JOptionPane.showMessageDialog(f, "회원수정 성공");
//				}else {
//					JOptionPane.showMessageDialog(f, "회원수정 실패, 재입력해주세요.");
//				}
//			}//action
//		}); //b3
//		
//		b4.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("회원검색처리");
//				String id = t1.getText();
//				
//				MemberDAO3 dao = new MemberDAO3();
//				MemberVO bag = dao.one(id); //MemberVO
//				if (bag != null) {
//				t2.setText(bag.getPw());
//				t3.setText(bag.getName());
//				t4.setText(bag.getTel());
//				t2.setBackground(Color.red);
//				t3.setBackground(Color.red);
//				t4.setBackground(Color.red);
//			}else {
//				JOptionPane.showMessageDialog(f, "검색결과없음");
//				t2.setText("");
//				t3.setText("");
//				t4.setText("");
//			}
//				
//			}//action
//		}); //b2
//		
		
		
		//f에 위에 있는 요소들을 add로 붙여주어야하는데,
		//붙이는 순서대로 물흐르듯이 붙여주고 싶음.
		//물흐르듯이 붙여주는 부품이 필요
		FlowLayout flow = new FlowLayout();
		
		//폰트를 설정하기 위해 font부품 필요 
		Font font = new Font("궁서", Font.BOLD, 40);
		
		//////////// 필요한 부품(객체)를 ram에 가져다 놓고, 준비 끝 ///////
		///조립을 시작해보자. ///
		f.setLayout(flow);
		
		f.add(b3); f.add(b4);
		f.add(l1);
		f.add(l2); f.add(t1);
		f.add(l3); f.add(t2);
//		f.add(l4); f.add(t3);
//		f.add(l5); f.add(t4);
		f.add(b1); //f.add(b2);
//		f.add(b3); f.add(b4);
//		f.add(b5);
		
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
//		l4.setFont(font);
//		l5.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
//		t3.setFont(font);
//		t4.setFont(font);
		b1.setFont(font);
		//b2.setFont(font);
//		b3.setFont(font);
//		b4.setFont(font);
//		b5.setFont(font);
		
		t1.setBackground(Color.WHITE);
		t1.setForeground(Color.blue);
		t2.setBackground(Color.WHITE);
		t2.setForeground(Color.blue);
//		t3.setBackground(Color.yellow);
//		t3.setForeground(Color.blue);
//		t4.setBackground(Color.yellow);
//		t4.setForeground(Color.blue);
		
		b1.setBackground(Color.WHITE); //배경색
		b1.setForeground(Color.red); //글자색 
		//b2.setBackground(Color.WHITE);
		//b2.setForeground(Color.red);
//		b3.setBackground(Color.pink);
//		b3.setForeground(Color.red);
//		b4.setBackground(Color.pink);
//		b4.setForeground(Color.red);
//		b5.setBackground(Color.pink);
//		b5.setForeground(Color.red);
		
		f.getContentPane();
		//맨 끝으로~~~~~
		f.setVisible(true);

	}
	}
