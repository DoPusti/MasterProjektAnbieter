package com.example.MasterProjektAnbieter;

import com.example.MasterProjektAnbieterJAXBModels.AasEnv;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import org.junit.jupiter.api.Test;

import java.io.File;

class AasEnvTest {

    @Test
    void XmlFormater() {
        try {

            File file = new File("src\\main\\resources\\aasenvComplete.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(AasEnv.class);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            AasEnv aasenv = (AasEnv) unmarshaller.unmarshal(file);

            System.out.println(aasenv.getAssetAdministrationShells());
            System.out.println(aasenv.getAssets());
            System.out.println(aasenv.getSubmodels());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}