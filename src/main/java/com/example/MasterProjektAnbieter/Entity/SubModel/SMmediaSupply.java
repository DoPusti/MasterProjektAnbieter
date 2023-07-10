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
public class SMmediaSupply {

    @Column(nullable = true)
    float OperatingCurrent;

    @Column(nullable = true)
    float OperatingVoltage;

    @Column(nullable = true)
    float CompressedAirPressure;

    @Column(nullable = true)
    float AirFlow;
}
