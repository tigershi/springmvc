package cn.djel.test.print;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class PrintTest {
	
 public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable(){

		@Override
		public void run() {
			// TODO Auto-generated method stub
			JFrame frame = new PrintTestFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		}});
	}
}
