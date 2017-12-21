import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.awt.image.*;
import javax.imageio.*;
import java.io.OutputStream;
import java.net.*;
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.PrintWriter;
public class URLdownload {
	public static String[] getURLs(String inputFile) throws FileNotFoundException {
		 Scanner keyboard = new Scanner(new File(inputFile));
		 String[] link = new String[0];
		    
		        while (keyboard.hasNextLine()) { 
		int len = link.length; // while there are links, len will be length of the new url(s)

		link = Arrays.copyOf(link, len + 1); //empty spaces of the new array 
		link[len] = keyboard.nextLine(); // get the new link and add to array
		        }

		        return link;
		  }
			private static void saveURL(String outFile, String[] url) throws FileNotFoundException {

		        PrintWriter pw = new PrintWriter(new File(outFile));// accepts ALL values; int and string
		        pw.println("Number of line read: " + url.length);

		        for (String urlTemp : url) { //for each url make copy

		              pw.println("\n URL: " + urlTemp); //print it

		              try {//test given the according variables
		            	  URL u = new URL(urlTemp);

		                  pw.println("Protocol: " + u.getProtocol());

		                  pw.println("Host: " + u.getHost());

		                  pw.println("File: " + u.getFile());
		                  
		                  pw.println("Reference: "+ u.getRef());
		  
		                  System.out.println(download(u) + " downloaded");//save 

		            } catch (MalformedURLException invalidUrl) {

		                  System.out.println("Not a valid URL: " + urlTemp);

		            } catch (IOException e) {

		                  System.out.println(e.getMessage());

		            }

		      }
		 pw.close();
		 //get file size of input file
		      Scanner info = new Scanner(System.in);
		      System.out.print("\n Enter file name (the filename is urlIn.txt) ");
		      String fileName = info.nextLine();
		      File size = new File(fileName);
		      System.out.println("the size of the file in bytes is: " + size.length());
		}

		              
			private static String download(URL u) throws IOException {

		        String fileName = u.getFile();
		 
		        

		        fileName = fileName.substring(fileName.lastIndexOf("/") + 1);//'/' is the last seperator

		        fileName = fileName.substring(fileName.lastIndexOf(":") + 1);
		//get input and output streams
		        InputStream is = u.openStream();

		        OutputStream os = new FileOutputStream(new File(fileName));

		        os.close();

		        is.close();
		        
		        return fileName;

		  }
			public static void main(String[] args) {
				
		        if (args.length == 2) { //2 file conditions 
		        	
		              String inputFile = args[0];

		              String outFile = args[1];
		              try {

		                    String[] url = getURLs(inputFile);// get url from input

		                    saveURL(outFile, url);

		              } catch (FileNotFoundException nf) {

		                    System.out.println(nf.getMessage());

		              }

		        } else

		              System.out.println("Provide 1 input and 1 output file. ");
		  }
			
}
