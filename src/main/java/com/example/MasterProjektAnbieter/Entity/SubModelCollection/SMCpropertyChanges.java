package com.example.MasterProjektAnbieter.Entity.SubModelCollection;

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
public class SMCpropertyChanges {

    @Column(nullable = true)
    float PositionX;

    @Column(nullable = true)
    float PositionY;

    @Column(nullable = true)
    float PositionZ;
}
