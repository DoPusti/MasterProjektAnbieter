package com.example.MasterProjektAnbieter;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"preferredName","shortName","unit","dataType","definition"})
public class DataSpecificationIEC61360 {

    @XmlElement(name="preferredName")
    private DataSpecificationIEC61360 preferredName;
}
