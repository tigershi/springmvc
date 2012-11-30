package cn.djel.test.serviceprint;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.DocAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;

import cn.djel.test.print.LocatePrint;

public class PrintTest2 {
	
	public void doPrint(DocFlavor flavor, Object printData, AttributeSet serviceAttributes,DocAttributeSet docAttributes,PrintRequestAttributeSet printAttributes){
		PrintService[] services = PrintServiceLookup.lookupPrintServices(flavor, serviceAttributes);
		PrintService serviced = PrintServiceLookup.lookupDefaultPrintService();
		DocPrintJob job = null;
		if(serviced ==null){
			for(PrintService ps:services){
				System.out.println(ps.getName());
				System.out.println("use printservice is not default");
			}
			job = services[0].createPrintJob();	
		}else{
			job =serviced.createPrintJob();
			System.out.println("use default printservice");
		}
		
		System.out.println("hello");
		Doc doc = new SimpleDoc(printData,flavor,docAttributes);
		try {
			job.print(doc, printAttributes);
		} catch (PrintException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("print exception",e);
		}
		
	}
   public static void main(String[] args) {
	PrintTest2 pt = new PrintTest2();
	LocatePrint lp = new LocatePrint();
	InputStream fis = null;
	try {
		fis = new FileInputStream("D:\\aaa.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	pt.doPrint(DocFlavor.INPUT_STREAM.AUTOSENSE, fis, null, null, null);
	//pt.doPrint(DocFlavor.SERVICE_FORMATTED.PRINTABLE, lp, null, null, null);
	
}
}
