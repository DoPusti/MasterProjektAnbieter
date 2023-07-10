package com.example.MasterProjektAnbieter.Entity;

import com.example.MasterProjektAnbieter.Entity.SubModel.SMassurances;
import com.example.MasterProjektAnbieter.Entity.SubModel.SMeconomicFactors;
import com.example.MasterProjektAnbieter.Entity.SubModel.SMidentification;
import com.example.MasterProjektAnbieter.Entity.SubModel.SMmediaSupply;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_assurance")
public class Aasxpackage {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    Long id;


    @Embedded
    public SMidentification identification;

    @Embedded
    public SMassurances assurances;

    @Embedded
    public SMmediaSupply mediaSupply;

    @Embedded
    public SMeconomicFactors economicFactors;










}
