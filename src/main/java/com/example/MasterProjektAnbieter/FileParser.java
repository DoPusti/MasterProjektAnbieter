package com.example.MasterProjektAnbieter;

import com.example.MasterProjektAnbieter.Entity.Aasxpackage;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
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
import java.lang.reflect.Field;

public class FileParser {

    public Field[] getFields() {
        Aasxpackage AASXPackage = new Aasxpackage();
        Class<?> clazz = Aasxpackage.class;
        Field[] fields = clazz.getDeclaredFields();
        return fields;
    }
    public Aasxpackage parseXMLObject(MultipartFile file) throws IOException, ParserConfigurationException, SAXException {
        // Definition für Reflection API
        Aasxpackage AASXPackage = new Aasxpackage();
        Class<?> clazz = Aasxpackage.class;
        Field[] fields = clazz.getDeclaredFields();

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


                for (Field field : fields) {
                    if (field.getName().equals(idShort)) {
                        field.setAccessible(true);
                        try {
                            Field field1 = AASXPackage.getClass().getDeclaredField(idShort);
                            Class<?> fieldType = field1.getType();
                            if (String.valueOf(value).equals("NaN")) {
                                System.out.println("Wert ist NaN");
                            } else {
                                if (fieldType == int.class || fieldType == Integer.class) {
                                    field.setInt(AASXPackage, Integer.parseInt(value));
                                } else if (fieldType == boolean.class) {
                                    field.setBoolean(AASXPackage, Boolean.parseBoolean(value));
                                } else if (fieldType == float.class || fieldType == Float.class) {
                                    field.setFloat(AASXPackage, Float.parseFloat(value));
                                } else {
                                    field.set(AASXPackage, value);
                                }
                            }
                        } catch (IllegalAccessException | NoSuchFieldException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
        return AASXPackage;
    }

    public Aasxpackage parseJSONObject(MultipartFile file) throws JSONException, IOException {
        // Definition für Reflection API
        Aasxpackage AASXPackage = new Aasxpackage();
        Class<?> clazz = Aasxpackage.class;
        Field[] fields = clazz.getDeclaredFields();


        // JSON-Datei verarbeiten
        String jsonData = new String(file.getBytes());
        JSONObject jsonObject = new JSONObject(jsonData);
        JSONArray idShortArray = jsonObject.getJSONArray("kind");

        for (int i = 0; i < idShortArray.length(); i++) {
            JSONObject aasObj = idShortArray.getJSONObject(i);
            String idShort = aasObj.getString("idShort");
            int value = aasObj.getInt("value");
            System.out.println("IdShort: " + idShort + ", Value: " + value);
            for (Field field : fields) {
                if (field.getName().equals(idShort)) {
                    field.setAccessible(true);
                    try {
                        Field field1 = AASXPackage.getClass().getDeclaredField(idShort);
                        Class<?> fieldType = field1.getType();
                        if (fieldType == int.class || fieldType == Integer.class) {
                            field.setInt(AASXPackage, Integer.parseInt(String.valueOf(value)));
                        } else if (fieldType == boolean.class) {
                            field.setBoolean(AASXPackage, Boolean.parseBoolean(String.valueOf(value)));
                        } else if (fieldType == float.class) {
                            field.setFloat(AASXPackage, Float.parseFloat(String.valueOf(value)));
                        } else {
                            field.set(AASXPackage, value);
                        }
                    } catch (IllegalAccessException | NoSuchFieldException e) {
                        throw new RuntimeException(e);
                    }
                }
            }


        }
        return AASXPackage;
    }

}
