package com.example.MasterProjektAnbieter;

import jakarta.xml.bind.annotation.*;
import lombok.Data;
import java.util.List;

@XmlRootElement(name ="aasenv")
@XmlType(propOrder = {"assetAdministrationShells","assets","submodels"})
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class AasEnv {

    @XmlElement(name ="assetAdministrationShells")
    private AssetAdministrationShells assetAdministrationShells;

    @XmlElement(name ="assets")
    private Assets assets;


    @XmlElement(name ="submodels")
    private List<SubModels> submodels;

    // Wird aktuell nicht benötigt
    /*
    @XmlElement(name ="conceptDescriptions")
    private ConceptDescriptions conceptDescriptions;

     */

}
