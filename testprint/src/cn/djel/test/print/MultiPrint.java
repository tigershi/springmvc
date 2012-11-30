package cn.djel.test.print;

import java.awt.Graphics;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.FileInputStream;
import java.io.InputStream;

public class MultiPrint implements Printable {
	
	public MultiPrint(FileInputStream inputStream){
		this.inputStream = inputStream;
	}
	
	//get a book progect
     private Book makeBook(Printable coverpage, Printable bodypage, PageFormat pageFormat, int pageCount){
	  if(pageFormat == null){
		  PrinterJob job = PrinterJob.getPrinterJob();
		  pageFormat = job.defaultPage();
	  }
	  Book book = new Book();
	  book.append(coverpage, pageFormat);
	  book.append(bodypage, pageFormat);
	  return book;
  }

	@Override
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)
			throws PrinterException {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public 
  
    private InputStream inputStream; 
    private int pageCount;
}
