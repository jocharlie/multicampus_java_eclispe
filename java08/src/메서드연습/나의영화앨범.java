
		package 메서드연습;

		import java.awt.BorderLayout;
		import java.awt.Color;
		import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
		import javax.swing.JLabel;
import javax.swing.JOptionPane;

		//코드정리: 컨트롤 + 쉬프트 + f
		public class 나의영화앨범 {

			static int index = 2;
				
			public static void main(String[] args) {
				String[] title = { "더 퍼스트 슬램덩크", "어벤져스", "너의이름은", "센과치히로의행방불명",
				"베테랑"};
		String[] img = {"sld.png","aven.png","name.png","sen.png","bete.png"};
				double[] jumsu = { 9.28, 9.72, 8.82, 6.62, 8.85 };
				
				JFrame f = new JFrame();
				f.setSize(516, 530);
				f.getContentPane().setBackground(Color.green);
				
				Font font = new Font("궁서", Font.BOLD, 40); //객체생성를 하는데, 특정한 입력값을 넣지 않으면 못만들게 할 수 있음
				
				//배치부품(객체)를 바꾸어주지 않으면 경계레이아웃을 사용하도록 셋팅
				//BorderLayout
				
				
				JLabel  top = new JLabel("영화제목");
				top.setFont(font);
				f.add(top, BorderLayout.NORTH);
				
				JLabel  center = new JLabel();
				center.setFont(font);
				ImageIcon icon = new ImageIcon(img[2]);
				center.setIcon(icon);
				f.add(center, BorderLayout.CENTER);
				
				//string.valueof() : int, double, ... => String으로 변환
				//Integer.parse() : double. String, ....=>int으로 변환
				//Double.parse() : int, String, .....=> double으로 변환
				JLabel  under = new JLabel(String.valueOf(jumsu[2]));
				under.setHorizontalAlignment(0);
				under.setForeground(Color.blue);
				under.setFont(font);
				f.add(under, BorderLayout.SOUTH);
				
				
				JButton left = new JButton("왼  쪽");
				left.setBackground(Color.pink);
				left.setFont(font);
				f.add(left, BorderLayout.WEST);
				
				//액션처리 하는 방법 1) 액션기능을 add  2)클릭액션이 있을 때 처리할 부품을 만들어주세요.
				//3)클릭액션이 있을 때 어떻게 처리할지 내용을 코딩해주세요.
				
				left.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if (index > 0) {
							// 현재 인덱스보다 하나 적은 값들로 top, center, under를 setting
							top.setText(title[index - 1]);
							ImageIcon icon = new ImageIcon(img[index - 1]);
							center.setIcon(icon);
							under.setText(jumsu[index - 1] + "");
							index--; // index = index - 1; index -= 1;
						}else {
							JOptionPane.showMessageDialog(f, "더 이상 없습니다.");
						}
					}
				});
				
				
				
				
				JButton right = new JButton("오른쪽");
				right.setBackground(Color.pink);
				right.setFont(font);
				f.add(right, BorderLayout.EAST);
				
				right.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						if (index < 4) {
							// 현재 인덱스보다 하나 적은 값들로 top, center, under를 setting
							top.setText(title[index + 1]);
							ImageIcon icon = new ImageIcon(img[index + 1]);
							center.setIcon(icon);
							under.setText(jumsu[index + 1] + "");
							index++; // index = index -1; index -=1;
						}else {
							JOptionPane.showMessageDialog(f, "응 없어");
						}
					}
				});
				
				
				//프로그램 끝나면 자동으로 exit
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
				
				
				
				
				
				
				f.setVisible(true);
			}
		}
