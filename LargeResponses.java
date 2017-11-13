import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;


public class LargeResponses {
	private static final Scanner scan=new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {
        
		String file=System.getProperty("user.dir");
		
		int totalBytes=0;
		int totsl_requests=0;
       
		String filename=scan.nextLine();
		String org_file="hosts_"+filename+".txt";
		Scanner s = new Scanner(new File(file+"\\raghu_raghu.txt"));
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNextLine()){
		    list.add(s.nextLine());
		}
		
		java.util.Iterator<String> itr=list.iterator();
		
		while(itr.hasNext())
		{
			String p=itr.next();
			String[] splited = p.split("\\s+");
			int byt=Integer.parseInt(splited[6]);
			if(byt>5000);
			{
				
				totalBytes=totalBytes+byt;
				totsl_requests++;
		    }
			
		}
		
		
		System.out.println(totalBytes);
		System.out.println(totsl_requests);
		
		
	}

}
