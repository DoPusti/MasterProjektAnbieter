package com.example.MasterProjektAnbieter.repository;

import com.example.MasterProjektAnbieter.Entity.Aasxpackage;
import com.example.MasterProjektAnbieter.Entity.SubModel.SMassurances;
import com.example.MasterProjektAnbieter.Entity.SubModel.SMeconomicFactors;
import com.example.MasterProjektAnbieter.Entity.SubModel.SMidentification;
import com.example.MasterProjektAnbieter.Entity.SubModel.SMmediaSupply;
import com.example.MasterProjektAnbieter.Entity.SubModelCollection.SMCconstraints;
import com.example.MasterProjektAnbieter.Entity.SubModelCollection.SMCproperties;
import com.example.MasterProjektAnbieter.Entity.SubModelCollection.SMCpropertyChanges;
import com.example.MasterProjektAnbieter.Entity.SubModelCollection.SMCspaceRequirement;
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
        //SM von Package
        SMidentification identification = SMidentification.builder()
                .URL("123")
                .AssetId("234")
                .SerialNumber("222")
                .build();

        //SCM von SMassurances
        SMCproperties properties = SMCproperties.builder()
                .Mass(1.2F)
                .ConnectionType("Super")
                .Length(1.2F).build();

        //SCM von SMassurances
        SMCpropertyChanges propertyChanges = SMCpropertyChanges.builder()
                .PositionZ(1.2F)
                .PositionY(1.2F).build();

        //SCM von SMassurances
        SMCconstraints constraints = SMCconstraints.builder()
                .ForceZ(1.2F)
                .ForceX(1.2F).build();

        //SM von Package
        SMassurances SMAssurances = SMassurances.builder()
                .properties(properties)
                .propertyChanges(propertyChanges)
                .constraints(constraints)
                .build();

        //SM von Package
        SMmediaSupply mediaSuplly = SMmediaSupply.builder()
                .AirFlow(2.2F)
                .build();


        //SMC von economicFactors
        SMCspaceRequirement spaceRequirement = SMCspaceRequirement.builder()
                .Spacelength(2.2F)
                .Spacewidth(3.51F)
                .build();

        //SM von Package
        SMeconomicFactors economicFactors = SMeconomicFactors.builder()
                .Price(2.2F)
                .spaceRequirement(spaceRequirement)
                .build();


        Aasxpackage aasxpackage = Aasxpackage.builder()
                .identification(identification)
                .assurances(SMAssurances)
                .mediaSupply(mediaSuplly)
                .economicFactors(economicFactors)
                .build();
        aasxPackageRepository.save(aasxpackage);
    }

    @Test
    public void printAllAssurance() {
        List<Aasxpackage> AasxpackageList =
                aasxPackageRepository.findAll();
        System.out.println("assuranceList = " + AasxpackageList);
    }
}