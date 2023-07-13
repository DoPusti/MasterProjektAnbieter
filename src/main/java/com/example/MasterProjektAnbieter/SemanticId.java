package com.example.MasterProjektAnbieter;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

@Data
public class SemanticId {
    @XmlElement(name="aas:keys")
    private String keys;
}
