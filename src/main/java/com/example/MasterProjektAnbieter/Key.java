package com.example.MasterProjektAnbieter;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;

import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"type","local","idType"})
public class Key {
    @XmlElement(name ="type")
    private String type;

    @XmlElement(name ="local")
    private String local;

    @XmlElement(name ="idType")
    private String idType;
}