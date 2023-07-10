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
public class SMenvironmentalConditions {

    @Column(nullable = true)
    float Temperature;

    @Column(nullable = true)
    float Pressure;

    @Column(nullable = true)
    float Humidity;

    @Column(nullable = true)
    Boolean Purity;

    @Column(nullable = true)
    float FoodGrade;

    @Column(nullable = true)
    int Explosiveness;


}
