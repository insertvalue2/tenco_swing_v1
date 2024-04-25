package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx2 extends JFrame {

	private JButton[] buttons; 

	public FlowLayoutEx2() {
		super.setTitle("FlowLayout 연습");
		super.setSize(500, 500);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initData();
		setInitLayout();
	}

	public void initData() {
		buttons = new JButton[6]; // 공간만 선언 [][][][][][] 
		                          //              0 1 2 3 4 5 
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("[ button " + (i + 1) + " ]");
		}
	}

	public void setInitLayout() {
		super.setLayout(new FlowLayout(FlowLayout.LEADING, 50, 50)); 
		for (int i = 0; i < buttons.length; i++) {
			super.add(buttons[i]);
		}
	}

	public static void main(String[] args) {
		new FlowLayoutEx2(); 
	} // end of main
}
