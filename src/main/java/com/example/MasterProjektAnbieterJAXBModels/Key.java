package com.example.MasterProjektAnbieterJAXBModels;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Key {
    @XmlAttribute(name ="type")
    private String type;

    @XmlAttribute(name ="local")
    private Boolean local;

    @XmlAttribute(name ="idType")
    private String idType;
}