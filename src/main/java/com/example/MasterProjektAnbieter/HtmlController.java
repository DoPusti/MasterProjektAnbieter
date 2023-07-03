package com.example.MasterProjektAnbieter;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

@RestController
public class HtmlController {

    @PostMapping("/submit-form")
    public String submitForm(@RequestParam("files") MultipartFile[] files) {
        for (MultipartFile file : files) {
            try {
                if (file.getContentType().equals("application/json")) {
                    // JSON-Datei verarbeiten
                    String jsonData = new String(file.getBytes());
                    JSONObject jsonObject = new JSONObject(jsonData);
                    JSONArray idShortArray = jsonObject.getJSONArray("aas:property");

                    for (int i = 0; i < idShortArray.length(); i++) {
                        JSONObject aasObj = idShortArray.getJSONObject(i);
                        String idShort = aasObj.getString("idShort");
                        int value = aasObj.getInt("value");
                        System.out.println("IdShort: " + idShort + ", Value: " + value);
                    }
                    System.out.println(jsonData);
                    // Führe die entsprechenden Operationen mit den JSON-Daten aus
                    return "JSON-Datei erfolgreich verarbeitet.";
                } else if (file.getContentType().equals("text/xml")) {

                    // XML-Datei verarbeiten
                    String xmlData = new String(file.getBytes());
                    // Erstellung eines Document-Objekts aus XML-Datei
                    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder builder = factory.newDocumentBuilder();
                    Document document = builder.parse(new ByteArrayInputStream(xmlData.getBytes()));
                    // Liste aller Element von aas:property
                    NodeList nodeList = document.getElementsByTagName("aas:property");

                    for (int i = 0; i < nodeList.getLength(); i++) {
                        Node node = nodeList.item(i);
                        if (node.getNodeType() == Node.ELEMENT_NODE) {
                            Element element = (Element) node;

                            String idShort = element.getElementsByTagName("aas:idShort").item(0).getTextContent();
                            String value = element.getElementsByTagName("aas:value").item(0).getTextContent();
                            System.out.println("idShort: " + idShort + ", value: " + value);
                            //
                        }
                    }
                    // Führe die entsprechenden Operationen mit den XML-Daten aus
                    return "XML-Datei erfolgreich verarbeitet.";
                } else {
                    return "Nur JSON- und XML-Dateien werden akzeptiert.";
                }
            } catch (IOException e) {
                return "Fehler beim Verarbeiten der Datei.";

            } catch (ParserConfigurationException | SAXException e) {
                throw new RuntimeException(e);
            }
        }


        return "Datei erfolgreich verarbeitet.";
    }
}
