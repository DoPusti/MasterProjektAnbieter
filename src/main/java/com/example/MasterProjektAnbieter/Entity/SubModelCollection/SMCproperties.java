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
public class SMCproperties {

    @Column(nullable = true)
    float Mass;

    @Column(nullable = true)
    float Length;

    @Column(nullable = true)
    float Width;

    @Column(nullable = true)
    Float Height;

    @Column(nullable = true)
    float X;

    @Column(nullable = true)
    float Y;

    @Column(nullable = true)
    float Z;

    @Column(nullable = false)
    String ConnectionType;

    @Column(nullable = true)
    Boolean Parallelgripper;

    @Column(nullable = true)
    Boolean Magneticgripper;

    @Column(nullable = true)
    Boolean Vaccumgripper;
}
