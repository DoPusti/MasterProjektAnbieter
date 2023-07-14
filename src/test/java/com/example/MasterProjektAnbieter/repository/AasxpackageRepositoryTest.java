package com.example.MasterProjektAnbieter.repository;

import com.example.MasterProjektAnbieter.Entity.Aasxpackage;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

// Tests mit der Datenbank. Sobald Test durch ist, werden die Daten auch gleich gelöscht. Dafür braucht es
// die DataJpaTest
@RunWith(SpringRunner.class)
@SpringBootTest
class AasxpackageRepositoryTest {

    @Autowired
    private AasxPackageRepository aasxPackageRepository;

    @Test
    public void saveAssurance() {
        /*
        //SM von Package
        SMidentification identification = SMidentification.builder()
                .URL("123")
                .AssetId("234")
                .SerialNumber("222")
                .build();

         */


    }

    @Test
    public void printAllAssurance() {
        List<Aasxpackage> AasxpackageList =
                aasxPackageRepository.findAll();
        System.out.println("assuranceList = " + AasxpackageList);
    }
}