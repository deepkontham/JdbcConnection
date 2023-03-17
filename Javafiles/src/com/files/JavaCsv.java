 package com.files;

import java.io.FileWriter;
import java.io.IOException;
import com.opencsv.CSVWriter;

public class JavaCsv {
	public static void main(String[] args) {
		
		
		try {
			CSVWriter write=new  CSVWriter(new FileWriter("java.csv"));
			String set1[]= {"name","country","id","dept"};
			String set2[]= {"deep","india","2","civil"};
			String set3[]= {"laxman","india","3","mech"};
			String set4[]= {"name","india","4","min"};
			
			write.writeNext(set1);
			write.writeNext(set2);
			write.writeNext(set3);
			write.writeNext(set4);

			
			write.flush();
			System.out.println("success");
//			 List list= new List();
//			list.add
//			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
