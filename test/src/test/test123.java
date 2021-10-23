package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class test123 {

	private final static int IBUTTON = 5;
	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test123 window = new test123();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test123() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("나라사랑카드"); // 프레임타이틀
		frame.setResizable(false); // 프레임크기조절 x
		frame.setBounds(100, 100, 928, 566);
		frame.setLocationRelativeTo(null); // 실행시 화면정중앙
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X누르면 종료
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(58, 25, 259, 428); // 패널위치
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel klabel = new JLabel("New label");
		klabel.setBounds(12, 5, 235, 158);
		panel.add(klabel);

		JButton kbtn = new JButton("글자");
		kbtn.setBounds(0, 0, 259, 428); // x,y,width,height
		// btnNewButton.setContentAreaFilled(false); // 버튼채우기 X
		// btnNewButton.setBorderPainted(false); // 버튼테두리 해제
		kbtn.setBorder(new LineBorder(Color.BLACK)); // 버튼테두리색상
		panel.add(kbtn); // 패널에 버튼추가
		kbtn.setOpaque(false); // 버튼 투명하게
		// 한국 버튼 리스너
		kbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//kbtn.setVisible(false);
			}
		});

		JPanel[] worldpan = new JPanel[IBUTTON];
		JButton[] worldbtn = new JButton[IBUTTON];
		JLabel[] worldlbl = new JLabel[IBUTTON];
		for (int i = 1; i < IBUTTON; i++) {
			// 패널 4개
			worldpan[i] = new JPanel();

			// 버튼 4개
			worldbtn[i] = new JButton();

			// 라벨 4개
			worldlbl[i] = new JLabel();

			switch (i) {
			case 1:
				worldpan[i].setBounds(408, 25, 219, 198);
				frame.getContentPane().add(worldpan[i]);
				worldpan[i].setLayout(null);
				worldbtn[i].setBounds(0, 0, 219, 198);
				worldpan[i].add(worldbtn[i]);
				worldlbl[i].setBounds(0, 0, 219, 198);
				worldpan[i].add(worldlbl[i]);
				worldbtn[i].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						for (int j = 1; j < 5; j++) {
							worldbtn[j].setVisible(false);
						}
					}
				});
				break;
			case 2:
				worldpan[i].setBounds(408, 255, 219, 198);
				frame.getContentPane().add(worldpan[i]);
				worldpan[i].setLayout(null);
				worldbtn[i].setBounds(0, 0, 219, 198);
				worldpan[i].add(worldbtn[i]);
				worldlbl[i].setBounds(0, 0, 219, 198);
				worldpan[i].add(worldlbl[i]);
				worldbtn[i].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						for (int j = 1; j < 5; j++) {
							worldbtn[j].setVisible(false);
						}
					}
				});
				break;
			case 3:
				worldpan[i].setBounds(677, 25, 219, 198);
				frame.getContentPane().add(worldpan[i]);
				worldpan[i].setLayout(null);
				worldbtn[i].setBounds(0, 0, 219, 198);
				worldpan[i].add(worldbtn[i]);
				worldlbl[i].setBounds(0, 0, 219, 198);
				worldpan[i].add(worldlbl[i]);
				worldbtn[i].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						for (int j = 1; j < 5; j++) {
							worldbtn[j].setVisible(false);
						}
					}
				});
				break;
			case 4:
				worldpan[i].setBounds(677, 255, 219, 198);
				frame.getContentPane().add(worldpan[i]);
				worldpan[i].setLayout(null);
				worldbtn[i].setBounds(0, 0, 219, 198);
				worldpan[i].add(worldbtn[i]);
				worldlbl[i].setBounds(0, 0, 219, 198);
				worldpan[i].add(worldlbl[i]);
				worldbtn[i].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						for (int j = 1; j < 5; j++) {
							worldbtn[j].setVisible(false);
						}
					}
				});
				break;
			}
			worldbtn[i].setBorder(new LineBorder(Color.BLACK));

		}

	}

}
