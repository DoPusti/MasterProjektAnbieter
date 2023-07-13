package com.example.MasterProjektAnbieter;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;

@Data
@XmlType(propOrder = {"idShort","identification","kind","semanticId"})
public class SubModel {
    @XmlElement(name="aas:idShort")
    private String idShort;

    @XmlElement(name="aas:identification")
    private String identification;

    @XmlElement(name="aas:kind")
    private String kind;

    @XmlElement(name="aas:semanticId")
    private String semanticId;

}
