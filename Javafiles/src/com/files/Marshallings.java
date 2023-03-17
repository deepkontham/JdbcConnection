
package com.files;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Marshallings {
	public static void main(String[] args) throws JAXBException {
		
	
	Student S=new Student(1, "PradeeP");
	JAXBContext g=JAXBContext.newInstance(Student.class);
	Marshaller m=g.createMarshaller();
	m.marshal(S, new File("marshal.xml"));
	System.out.println("success");

}
}