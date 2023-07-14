package com.example.MasterProjektAnbieterJAXBModels;

import com.example.MasterProjektAnbieterJAXBModels.Keys;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"keys"})
public class AssetRef {
    @XmlElement(name ="keys")
    private Keys keys;
}
