package com.example.MasterProjektAnbieter.Entity.SubModel;

import com.example.MasterProjektAnbieter.Entity.SubModelCollection.SMCspaceRequirement;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SMeconomicFactors {

    @Column(nullable = true)
    float Price;

    @Embedded
    public SMCspaceRequirement spaceRequirement;

    @Column(nullable = true)
    int Lengthofusage;

    @Column(nullable = true)
    int MaintenanceInterval;

    @Column(nullable = true)
    int MaintanceDuration;

    @Column(nullable = true)
    int DeliveryTime;

    @Column(nullable = true)
    float OneTimeLicenceCost;

    @Column(nullable = true)
    float MonthlyLicenceCost;




}
