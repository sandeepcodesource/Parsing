package ParsingCode.parse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class SampleCode {

	public static void main(String[] args) throws IOException {
		
		File file = new File("anurag dec 21.pdf");
		InputStream is = new FileInputStream(file);
		
		PDFParser parser = new PDFParser(is);
		parser.parse();
		
		COSDocument cosdoc = parser.getDocument();
		PDDocument pddoc = new PDDocument(cosdoc);		
		
		PDFTextStripper str = new PDFTextStripper();
		String data = str.getText(pddoc);
		System.out.println(data);
			 
	}

	

}
