package cn.djel.test.serviceprint;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;

public class PrintServiceTest {
    public static void main(String[] args){
    	DocFlavor flavor = DocFlavor.URL.GIF;
    	PrintService[] services = PrintServiceLookup.lookupPrintServices(flavor, null);
    	if(args.length == 0){
    		if(services.length == 0){
    			System.out.println("No printer for flavor"+flavor);
    		}else{
    			System.out.println("Specify a file of flavor" + flavor
    					+"\n and optionally the number of the desired printer.");
    			for(int i=0; i<services.length; i++){
    				System.out.println((i+1)+ ":"+services[i].getName());
    			}
    		}
    		System.exit(0);
    	}
    	String fileName = args[0];
    	int p=1;
    	if(args.length>1){
    	p = Integer.parseInt(args[1]);
    	}
    	try {
    		if(fileName == null){
    			return;
    		}
			FileInputStream in = new FileInputStream(fileName);
			Doc doc = new SimpleDoc(in,flavor,null);
			DocPrintJob job = services[p-1].createPrintJob();
			job.print(doc, null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PrintException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    public static void printFile(DocFlavor flavor,String fileName,int serviceNumber){
    	PrintService[] services = PrintServiceLookup.lookupPrintServices(flavor, null);
    	
    	if(fileName == null){
    		if(services.length == 0){
    			System.out.println("No printer for flavor"+flavor);
    		}else{
    			System.out.println("Specify a file of flavor" + flavor
    					+"\n and optionally the number of the desired printer.");
    			for(int i=0; i<services.length; i++){
    				System.out.println((i+1)+ ":"+services[i].getName());
    			}
    		}
    		return;
    	}
    	
    	int p=1;
    	
    	try {
    		if(fileName == null){
    			return;
    		}
			FileInputStream in = new FileInputStream(fileName);
			Doc doc = new SimpleDoc(in,flavor,null);
			DocPrintJob job = services[p-1].createPrintJob();
			job.print(doc, null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PrintException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    	
    	
    	
    }
}   
