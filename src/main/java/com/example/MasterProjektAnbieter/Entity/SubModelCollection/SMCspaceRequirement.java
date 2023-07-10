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
public class SMCspaceRequirement {

    @Column(nullable = true)
    float Spacelength;

    @Column(nullable = true)
    float Spacewidth;

}
