package com.example.MasterProjektAnbieter;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;

import java.util.List;

@XmlRootElement(name ="aas:aasenv")
@XmlType(propOrder = {"assetAdministrationShells", "assets", "submodels"})
@Data
public class AasEnvironment {
    @XmlElement(name ="aas:assetAdministrationsShells")
    private String assetAdministrationShells;

    @XmlElement(name ="aas:assets")
    private List<Asset> assets;

    @XmlElement(name ="aas:submodels")
    private List<SubModel> submodels;
}
