package com.example.MasterProjektAnbieter;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class AasEnvironmentTest {

    @Test
    void XmlFormater() {
        try {

            File file = new File("src\\main\\resources\\aasenv.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(AasEnvironment.class);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            AasEnvironment aasenv = (AasEnvironment) unmarshaller.unmarshal(file);

            System.out.println(aasenv.getAssets().toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}