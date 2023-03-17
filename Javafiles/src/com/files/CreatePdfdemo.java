package com.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class CreatePdfdemo {

	public static void main(String[] args) {

		Document document = new Document();
		try {
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("java.pdf"));
			document.open();
			document.add(new Paragraph("Welcome to createiq"));

			PdfPTable table = new PdfPTable(3);
    		table.setWidthPercentage(105);
			table.setSpacingBefore(30f);
			table.setSpacingAfter(11f);

			float[] col = { 2f, 2f, 2f };
			table.setWidths(col);
			PdfPCell c1 = new PdfPCell(new Paragraph("    Name"));
			PdfPCell c2 = new PdfPCell(new Paragraph("    Name of institute"));
			PdfPCell c3 = new PdfPCell(new Paragraph("    column3"));
			table.addCell(c1);
			table.addCell(c2);
			table.addCell(c3);
			document.add(table);

			List unorderList = new List(List.UNORDERED);
			unorderList.add(new ListItem("Eduction details"));
			unorderList.add(new ListItem("skills"));
			unorderList.add(new ListItem("Experience"));
			unorderList.add(new ListItem("profile details"));
			document.add(unorderList);

			document.close();
			writer.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
