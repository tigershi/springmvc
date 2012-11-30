package cn.djel.test.print;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PrintTestFrame extends JFrame{
 public PrintTestFrame(){
	 setTitle("PrintTest");
	 setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	 canvas = new PrintComponent();
	 add(canvas,BorderLayout.CENTER);
	 attributes = new HashPrintRequestAttributeSet();
	 JPanel buttonPanel = new JPanel();
	 JButton printButton = new JButton("Print");
	 buttonPanel.add(printButton);
	 printButton.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
				try {
					PrinterJob job = PrinterJob.getPrinterJob();
					job.setPrintable(canvas);
					if(job.printDialog(attributes))
					job.print(attributes);
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(PrintTestFrame.this,e1);
					e1.printStackTrace();
				}
		}
		 
	 });
	 
	 JButton pageSetupButton = new JButton("page setup");
	 buttonPanel.add(pageSetupButton);
	 pageSetupButton.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			PrinterJob job = PrinterJob.getPrinterJob();
			job.pageDialog(attributes);
		}});
	 add(buttonPanel,BorderLayout.NORTH);
 }
 
 private PrintComponent canvas;
 private PrintRequestAttributeSet attributes;
 
 private static final int DEFAULT_WIDTH = 300;
 private static final int DEFAULT_HEIGHT = 300;
}
