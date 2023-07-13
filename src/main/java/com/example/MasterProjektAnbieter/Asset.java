package com.example.MasterProjektAnbieter;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;

@Data
@XmlType(propOrder = {"idShort", "identification", "kind"})
public class Asset {
    @XmlElement(name = "aas:idShort")
    private String idShort;

    @XmlElement(name = "aas:identification")
    private String identification;

    @XmlElement(name = "kind")
    private String kind;

}
