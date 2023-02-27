package myproject.dhip_java.Controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import myproject.dhip_java.Services.PdfGeneratorService;


@Controller
public class PdfExportController {
    
    private final PdfGeneratorService pdfGeneratorService;

    public PdfExportController(PdfGeneratorService pdfGeneratorService) {
        this.pdfGeneratorService = pdfGeneratorService;
    }

    @GetMapping("/pdf/generate")
    public void generatePDF(HttpServletResponse response,
                            @RequestParam String firstname,
                            @RequestParam String lastname,
                            @RequestParam String identitycard,
                            @RequestParam String address,
                            @RequestParam String email,
                            @RequestParam String dateregist,
                            @RequestParam String startdate

    ) throws IOException {
        response.setContentType("application/pdf");
        // DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        // String currentDateTime = dateFormat.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=Insurance-Policy(A4).pdf";
        response.setHeader(headerKey, headerValue);

        this.pdfGeneratorService.export(response, firstname, lastname, identitycard, address, email, dateregist, startdate);
    }


}
