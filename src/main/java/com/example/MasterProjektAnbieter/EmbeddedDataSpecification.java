package com.example.MasterProjektAnbieter;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;

import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"dataSpecificationContent","dataSpecification"})
public class EmbeddedDataSpecification {
    @XmlElement(name="dataSpecificationContent")
    private DataSpecificationContent dataSpecificationContent;

    @XmlElement(name="dataSpecification")
    private DataSpecification dataSpecification;

}
