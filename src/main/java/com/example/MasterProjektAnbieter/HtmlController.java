package com.example.MasterProjektAnbieter;

import com.example.MasterProjektAnbieter.Entity.Aasxpackage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Objects;

@RestController
public class HtmlController {
    // Controller (C)
    @PostMapping("/submit-form")
    public String submitForm(@RequestParam("files") MultipartFile[] files) throws IOException, ParserConfigurationException, SAXException {
        FileParser fileParser = new FileParser();

        for (MultipartFile file : files) {
            try {
                if (Objects.equals(file.getContentType(), "application/json")) {
                    Aasxpackage AASXPackage =  fileParser.parseJSONObject(file);
                   // System.out.println("Objekt fertig mit " + Aasxpackage.getLength());
                    return "JSON-Datei erfolgreich verarbeitet.";
                } else if (Objects.equals(file.getContentType(), "text/xml")) {

                    Aasxpackage AASXPackage =  fileParser.parseXMLObject(file);
                   // System.out.println("Objekt fertig mit " + Aasxpackage.getX());
                    return "XML-Datei erfolgreich verarbeitet.";
                }
            } catch (IOException | ParserConfigurationException | SAXException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }
}
