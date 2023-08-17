package 생성자맛보기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 혼자연습해보기 {

	// 심화
	// 1) 버튼을 클릭했을 때, 각 음식의 주문량을 체크해서 f의 title로 보여주세요.!!
	// f.setTitle("짬봉: " + count1 + "개, 우동: " + count2 + "개, " ~~);
	// 2) 음식의 값을 다 분리, 짬뽕은 3500, 우동은 3000, 짜장은 4000

	static int count; // 0으로 초기화, 전역변수!
	static int count1; // 짬뽕
	static int count2; // 우동
	static int count3; // 짜장
	static int count4; // 짜장
	static int count5; // 짜장
	static int count6; // 짜장
	static int count7; // 짜장
	static int count8; // 짜장
	static int count9; // 짜장
	static int count10; // 짜장
	static int count11; // 짜장
	final static int PRICE = 5000; // final은 변경불가, 상수
	// 상수변수를 쓸 때는 잘보이라고 변수명을 모두 대문자로!를 권장!!!
	final static int PRICE1 = 17000000; // 짬뽕
	final static int PRICE2 = 20000000; // 우동
	final static int PRICE3 = 50000000; // 짜장
	final static int PRICE4 = 90000000; // 짜장
	final static int PRICE5 = 150000000; // 짜장
	final static int PRICE6 = 300000000; // 짜장
	final static int PRICE7 = 70000000; // 짜장
	final static int PRICE8 = 80500000; // 짜장
	final static int PRICE9 = 50000000; // 짜장
	final static int PRICE10 = 40000000; // 짜장
	final static int PRICE11 = 34000000; // 짜장

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("피파온라인4 대한민국 스쿼드 맞추기");
		f.setSize(700, 700);
		f.getContentPane().setBackground(Color.CYAN);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton b1 = new JButton("골키퍼");
		JButton b2 = new JButton("좌측수비수");
		JButton b3 = new JButton("센터백1");
		JButton b4 = new JButton("센터백2");
		JButton b5 = new JButton("우측수비수");
		JButton b6 = new JButton("수비형미드필더1");
		JButton b7 = new JButton("수비형미드필더2");
		JButton b8 = new JButton("공격형미드필더");
		JButton b9 = new JButton("좌측공격수1");
		JButton b10 = new JButton("좌측공격수2");
		JButton b11 = new JButton("스트라이커");
		Font font = new Font("궁서", Font.ROMAN_BASELINE, 60);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);
		b6.setFont(font);
		b7.setFont(font);
		b8.setFont(font);
		b9.setFont(font);
		b10.setFont(font);
		b11.setFont(font);
		b1.setBackground(Color.yellow);
		b2.setBackground(Color.red);
		b3.setBackground(Color.red);
		b4.setBackground(Color.red);
		b5.setBackground(Color.red);
		b6.setBackground(Color.red);
		b7.setBackground(Color.red);
		b8.setBackground(Color.red);
		b9.setBackground(Color.red);
		b10.setBackground(Color.red);
		b11.setBackground(Color.red);

		JLabel textLabel = new JLabel("총 인원: ");
		textLabel.setFont(font);
		JLabel countLabel = new JLabel("0명");
		countLabel.setFont(font);
		JLabel imgLabel = new JLabel();
		ImageIcon icon = new ImageIcon("home.png");
		imgLabel.setIcon(icon);
		JLabel result = new JLabel("구단가치 0원");
		result.setFont(font);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("김승규.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				count1++;
				f.setTitle("골키퍼: " + count1 + "좌측수비수: " + count2 + "센터백1: " + count3 +"센터백2: " + count4 +
						"우측수비수: " + count5 + "수비형미드필더1: " + count6 + "수비형미드필더2: " + count7 +"공격형미드필더: " + count8 +
						"좌측공격수: " + count9 +"우측공격수: " + count10 +"스트라이커: " + count11 );
				int total = (count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3)+
						(count4 * PRICE4) + (count5 * PRICE5) + (count6 * PRICE6)+
						(count7 * PRICE7) + (count8 * PRICE8) + (count9 * PRICE9)+
						(count1 * PRICE10) + (count2 * PRICE11);
						
				result.setText("구단가치" + total + "원");
			}
		});
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("김진수.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				count1++;
				f.setTitle("골키퍼: " + count1 + "좌측수비수: " + count2 + "센터백1: " + count3 +"센터백2: " + count4 +
						"우측수비수: " + count5 + "수비형미드필더1: " + count6 + "수비형미드필더2: " + count7 +"공격형미드필더: " + count8 +
						"좌측공격수: " + count9 +"우측공격수: " + count10 +"스트라이커: " + count11 );
				int total = (count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3)+
						(count4 * PRICE4) + (count5 * PRICE5) + (count6 * PRICE6)+
						(count7 * PRICE7) + (count8 * PRICE8) + (count9 * PRICE9)+
						(count1 * PRICE10) + (count2 * PRICE11);
						
				result.setText("구단가치" + total + "원");
			}
		});
		
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("김민재.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				count1++;
				f.setTitle("골키퍼: " + count1 + "좌측수비수: " + count2 + "센터백1: " + count3 +"센터백2: " + count4 +
						"우측수비수: " + count5 + "수비형미드필더1: " + count6 + "수비형미드필더2: " + count7 +"공격형미드필더: " + count8 +
						"좌측공격수: " + count9 +"우측공격수: " + count10 +"스트라이커: " + count11 );
				int total = (count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3)+
						(count4 * PRICE4) + (count5 * PRICE5) + (count6 * PRICE6)+
						(count7 * PRICE7) + (count8 * PRICE8) + (count9 * PRICE9)+
						(count1 * PRICE10) + (count2 * PRICE11);
						
				result.setText("구단가치" + total + "원");
			}
		});
		
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("김영권.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				count1++;
				f.setTitle("골키퍼: " + count1 + "좌측수비수: " + count2 + "센터백1: " + count3 +"센터백2: " + count4 +
						"우측수비수: " + count5 + "수비형미드필더1: " + count6 + "수비형미드필더2: " + count7 +"공격형미드필더: " + count8 +
						"좌측공격수: " + count9 +"우측공격수: " + count10 +"스트라이커: " + count11 );
				int total = (count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3)+
						(count4 * PRICE4) + (count5 * PRICE5) + (count6 * PRICE6)+
						(count7 * PRICE7) + (count8 * PRICE8) + (count9 * PRICE9)+
						(count1 * PRICE10) + (count2 * PRICE11);
						
				result.setText("구단가치" + total + "원");
			}
		});
		
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("김문환.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				count1++;
				f.setTitle("골키퍼: " + count1 + "좌측수비수: " + count2 + "센터백1: " + count3 +"센터백2: " + count4 +
						"우측수비수: " + count5 + "수비형미드필더1: " + count6 + "수비형미드필더2: " + count7 +"공격형미드필더: " + count8 +
						"좌측공격수: " + count9 +"우측공격수: " + count10 +"스트라이커: " + count11 );
				int total = (count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3)+
						(count4 * PRICE4) + (count5 * PRICE5) + (count6 * PRICE6)+
						(count7 * PRICE7) + (count8 * PRICE8) + (count9 * PRICE9)+
						(count1 * PRICE10) + (count2 * PRICE11);
						
				result.setText("구단가치" + total + "원");
			}
		});
		
		b6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("정우영.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				count1++;
				f.setTitle("골키퍼: " + count1 + "좌측수비수: " + count2 + "센터백1: " + count3 +"센터백2: " + count4 +
						"우측수비수: " + count5 + "수비형미드필더1: " + count6 + "수비형미드필더2: " + count7 +"공격형미드필더: " + count8 +
						"좌측공격수: " + count9 +"우측공격수: " + count10 +"스트라이커: " + count11 );
				int total = (count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3)+
						(count4 * PRICE4) + (count5 * PRICE5) + (count6 * PRICE6)+
						(count7 * PRICE7) + (count8 * PRICE8) + (count9 * PRICE9)+
						(count1 * PRICE10) + (count2 * PRICE11);
						
				result.setText("구단가치" + total + "원");
			}
		});
		
		b7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("황인범.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				count1++;
				f.setTitle("골키퍼: " + count1 + "좌측수비수: " + count2 + "센터백1: " + count3 +"센터백2: " + count4 +
						"우측수비수: " + count5 + "수비형미드필더1: " + count6 + "수비형미드필더2: " + count7 +"공격형미드필더: " + count8 +
						"좌측공격수: " + count9 +"우측공격수: " + count10 +"스트라이커: " + count11 );
				int total = (count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3)+
						(count4 * PRICE4) + (count5 * PRICE5) + (count6 * PRICE6)+
						(count7 * PRICE7) + (count8 * PRICE8) + (count9 * PRICE9)+
						(count1 * PRICE10) + (count2 * PRICE11);
						
				result.setText("구단가치" + total + "원");
			}
		});
		
		b8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("이강인.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				count1++;
				f.setTitle("골키퍼: " + count1 + "좌측수비수: " + count2 + "센터백1: " + count3 +"센터백2: " + count4 +
						"우측수비수: " + count5 + "수비형미드필더1: " + count6 + "수비형미드필더2: " + count7 +"공격형미드필더: " + count8 +
						"좌측공격수: " + count9 +"우측공격수: " + count10 +"스트라이커: " + count11 );
				int total = (count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3)+
						(count4 * PRICE4) + (count5 * PRICE5) + (count6 * PRICE6)+
						(count7 * PRICE7) + (count8 * PRICE8) + (count9 * PRICE9)+
						(count1 * PRICE10) + (count2 * PRICE11);
						
				result.setText("구단가치" + total + "원");
			}
		});
		
		b9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("손흥민.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				count1++;
				f.setTitle("골키퍼: " + count1 + "좌측수비수: " + count2 + "센터백1: " + count3 +"센터백2: " + count4 +
						"우측수비수: " + count5 + "수비형미드필더1: " + count6 + "수비형미드필더2: " + count7 +"공격형미드필더: " + count8 +
						"좌측공격수: " + count9 +"우측공격수: " + count10 +"스트라이커: " + count11 );
				int total = (count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3)+
						(count4 * PRICE4) + (count5 * PRICE5) + (count6 * PRICE6)+
						(count7 * PRICE7) + (count8 * PRICE8) + (count9 * PRICE9)+
						(count1 * PRICE10) + (count2 * PRICE11);
						
				result.setText("구단가치" + total + "원");
			}
		});
		
		b10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("황희찬.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				count1++;
				f.setTitle("골키퍼: " + count1 + "좌측수비수: " + count2 + "센터백1: " + count3 +"센터백2: " + count4 +
						"우측수비수: " + count5 + "수비형미드필더1: " + count6 + "수비형미드필더2: " + count7 +"공격형미드필더: " + count8 +
						"좌측공격수: " + count9 +"우측공격수: " + count10 +"스트라이커: " + count11 );
				int total = (count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3)+
						(count4 * PRICE4) + (count5 * PRICE5) + (count6 * PRICE6)+
						(count7 * PRICE7) + (count8 * PRICE8) + (count9 * PRICE9)+
						(count1 * PRICE10) + (count2 * PRICE11);
						
				result.setText("구단가치" + total + "원");
			}
		});
		
		b11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("조규성.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				count1++;
				f.setTitle("골키퍼: " + count1 + "좌측수비수: " + count2 + "센터백1: " + count3 +"센터백2: " + count4 +
						"우측수비수: " + count5 + "수비형미드필더1: " + count6 + "수비형미드필더2: " + count7 +"공격형미드필더: " + count8 +
						"좌측공격수: " + count9 +"우측공격수: " + count10 +"스트라이커: " + count11 );
				int total = (count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3)+
						(count4 * PRICE4) + (count5 * PRICE5) + (count6 * PRICE6)+
						(count7 * PRICE7) + (count8 * PRICE8) + (count9 * PRICE9)+
						(count1 * PRICE10) + (count2 * PRICE11);
						
				result.setText("구단가치" + total + "원");
			}
		});
		

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		f.add(b11);
		f.add(textLabel);
		f.add(countLabel);
		f.add(imgLabel);
		f.add(result);

		f.setVisible(true);
	}

}
