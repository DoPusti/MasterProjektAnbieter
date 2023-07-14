package com.example.MasterProjektAnbieter;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

@Data
@XmlRootElement(name ="assets",namespace = "http://www.admin-shell.io/aas/2/0")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"idShort", "identification", "kind"})
public class Asset {
    @XmlElement(name = "idShort")
    private String idShort;

    @XmlElement(name = "identification")
    private String identification;

    @XmlElement(name = "kind")
    private String kind;

}
