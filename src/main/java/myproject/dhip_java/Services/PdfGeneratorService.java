package myproject.dhip_java.Services;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;


@Service
public class PdfGeneratorService {

    public void export(HttpServletResponse response, String firstname, String lastname, String identitycard, String address, String email, String startdate, String startdate2) throws DocumentException, IOException {

        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, response.getOutputStream());

        document.open();

        // Font size for Header
        Font fontTitle = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        fontTitle.setSize(22);

        // Font size for normal text
        Font fontNormal = FontFactory.getFont(FontFactory.HELVETICA);
        fontNormal.setSize(15);
        
        // Header
        Paragraph header = new Paragraph("Insurance Policy", fontTitle);
        header.setAlignment(Paragraph.ALIGN_CENTER);

        // Add space below the header
        header.setSpacingAfter(50);



        Paragraph firstLine = new Paragraph("First Name :  " + "......"+firstname+"......" + "   Lastname :  " + "......"+lastname+"......" + Chunk.NEWLINE, fontNormal);
        firstLine.setLeading(20);
        firstLine.setAlignment(Paragraph.ALIGN_CENTER);

        Paragraph secondLine = new Paragraph("ID Card :  " + "......"+identitycard+"......" + "   Address :  " + "......"+address+"......" + Chunk.NEWLINE, fontNormal);
        secondLine.setLeading(20);
        secondLine.setAlignment(Paragraph.ALIGN_CENTER);

        Paragraph thirdLine = new Paragraph("Email :  " + "......"+email+"......" + "    Date regist :  " + "......"+startdate+"......" + Chunk.NEWLINE, fontNormal);
        thirdLine.setLeading(20);
        thirdLine.setAlignment(Paragraph.ALIGN_CENTER);

        Paragraph fourthLine = new Paragraph("Start date :  " + "......"+startdate2+"......", fontNormal);
        fourthLine.setAlignment(Paragraph.ALIGN_CENTER);
        
        document.add(header);
        document.add(firstLine);
        document.add(thirdLine);
        document.add(fourthLine);


        document.close();

    }
    
}
