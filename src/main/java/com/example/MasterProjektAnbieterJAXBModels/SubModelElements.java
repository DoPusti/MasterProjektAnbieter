package com.example.MasterProjektAnbieterJAXBModels;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;

import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"submodelElement"})
public class SubModelElements {

    @XmlElement(name = "submodelElement")
    private List<SubModelElement> submodelElement;
}
