package cn.djel.test.serviceprint;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.SimpleDoc;
import javax.print.StreamPrintService;
import javax.print.StreamPrintServiceFactory;
import javax.print.event.PrintJobAdapter;
import javax.print.event.PrintJobEvent;

public class PrintStreamService {
		
		private static boolean jobRunning = true;
		
		public static void main(String[] args) throws Exception {
			
			// Open the image file
	        InputStream is = new BufferedInputStream(new FileInputStream("D:\\aaa.txt"));
	        
	        // Prepare the output file to receive the postscript
	        OutputStream fos = new BufferedOutputStream(new FileOutputStream("D:\\myfile.ps"));

	        // create a GIF doc flavor
	        DocFlavor flavor = DocFlavor.INPUT_STREAM.GIF;
	        
	        // Locate factories for print services that can be used with
	        
	        // a print job to output a stream of data in the GIF format
	        StreamPrintServiceFactory[] factories =
	            StreamPrintServiceFactory.lookupStreamPrintServiceFactories(
	                flavor,
	                DocFlavor.BYTE_ARRAY.POSTSCRIPT.getMimeType());
	        
	        // if suitable factory found
	        if (factories.length > 0) {
	        	
	        	// get a service that can print to the specified output stream.
	        	StreamPrintService service = factories[0].getPrintService(fos);
	        	
	        	// Create and return a PrintJob capable of handling data from
	            // any of the supported document flavors.
	            DocPrintJob printJob = service.createPrintJob();
	            
	            // register a listener to get notified when the job is complete
	            printJob.addPrintJobListener(new JobCompleteMonitor());
	            
	            // Construct a SimpleDoc with the specified 
	            // print data, doc flavor and doc attribute set.
	            Doc doc = new SimpleDoc(is, flavor, null);
	            
	            // Print a document with the specified job attributes.
	            printJob.print(doc, null);
	            
	            while (jobRunning) {
	            	Thread.sleep(1000);
	            }
	            
	            System.out.println("Exiting app");
	            
	            is.close();
	            fos.close();
	            
	        }
			
		}
		
		private static class JobCompleteMonitor extends PrintJobAdapter {
			@Override
			public void printJobCompleted(PrintJobEvent jobEvent) {
				System.out.println("Job completed");
				jobRunning = false;
			}
		}

	}

