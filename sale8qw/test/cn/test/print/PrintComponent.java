package cn.test.print;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.GeneralPath;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

import javax.swing.JComponent;

public class PrintComponent extends JComponent implements Printable{

	public void PaintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		drawPage(g2);
	}
	
	
	
	
	
	
	private void drawPage(Graphics2D g2) {
		// TODO Auto-generated method stub
		FontRenderContext context = g2.getFontRenderContext();//the font the render context
		Font f = new Font("serif",Font.PLAIN,72);//configure the font format
		GeneralPath clipShape = new GeneralPath();//the path of clip shape
		TextLayout layout = new TextLayout("hello",f,context);
	}






	@Override
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)
			throws PrinterException {
		// TODO Auto-generated method stub
		return 0;
	}

}
