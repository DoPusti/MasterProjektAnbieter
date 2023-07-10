package com.example.MasterProjektAnbieter.Entity.SubModel;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SMidentification {


    @Column(nullable = false, unique = true)
    String AssetId;

    @Column(nullable = false, unique = true)
    String SerialNumber;

    @Column(nullable = false, unique = true)
    String URL;
}
