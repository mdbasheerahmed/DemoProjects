package com.test.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;

public class ClassForName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

File someFile = new File("c:/temp/Newpdf1.pdf");
		
		//someFile.mkdir();
		FileInputStream fis = null;
		PdfReader pdfReader = null;
		PdfWriter writer = null;
		Document document = new Document(); 
		try {
			
			String desktop = System.getProperty ("user.home") + "/Desktop/";
			fis = new FileInputStream(desktop + "Newpdf1.pdf");
			pdfReader = new PdfReader(fis);
			
			//OutputStream outputStream = new FileOutputStream("C:\\Temp1\\" + "temp.pdf");
			//System.out.println("location of file :");
			final String FILE = desktop + "Newpdfxxx.pdf";
			int chapterNumber = 1;
			
			
			
			writer = PdfWriter.getInstance(document, new FileOutputStream(FILE));
            //writer.setViewerPreferences(PdfWriter.PageModeUseOutlines);
            document.open();
            chapterNumber++;
          //Create a Chapter for Cover Page
			Chapter chapter = new Chapter(new Paragraph(Font.BOLD, "Cover Page " + 
									"21342134"),chapterNumber);
			document.add(chapter);
			document.add(Chunk.NEWLINE);
			document.add(Chunk.NEWLINE);
			Section sectionname = chapter.addSection("SEW Attachment");
            PdfImportedPage page = null;
        	
            for (int i = 0; i < pdfReader.getNumberOfPages(); i++) {
				page = writer.getImportedPage(pdfReader, (i + 1));
				Image image = Image.getInstance(page);
				image.scaleToFit(300, 100);
				sectionname.add(image);
				//image.scaleToFit(300,100);
		        //image.setAlignment(com.lowagie.text.Image.ALIGN_CENTER);
		        //document.add(image);
			}
        	
            /*addMetaData(document);
            addTitlePage(document);
            addContent(document);*/
            //document.close();
			
			
			document.add(chapter);
			document.newPage();
			chapter.flushContent();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			
			try {
				if (writer!=null )
					//writer.close();
				if (document!=null)
					document.close();
				if (fis != null)fis.close();
				//if (outputStream != null) outputStream.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
