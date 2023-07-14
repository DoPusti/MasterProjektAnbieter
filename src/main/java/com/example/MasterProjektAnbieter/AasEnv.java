package com.example.MasterProjektAnbieter;

import jakarta.xml.bind.annotation.*;
import lombok.Data;
import java.util.List;

@XmlRootElement(name ="aasenv")
@XmlType(propOrder = {"assetAdministrationShells"})
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class AasEnv {

    @XmlElement(name ="assetAdministrationShells")
    private AssetAdministrationShells assetAdministrationShells;


    /*
    @XmlElement(name ="asset")
    private Asset assets;

     */
    /*
    @XmlElement(name ="submodels")
    private List<SubModel> submodels;
    */

    /*
    @XmlElement(name ="conceptDescriptions")
    private List<ConceptDescription> conceptDescriptions;
    */

}
