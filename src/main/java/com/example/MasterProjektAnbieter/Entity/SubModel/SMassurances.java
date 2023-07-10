package com.example.MasterProjektAnbieter.Entity.SubModel;

import com.example.MasterProjektAnbieter.Entity.SubModelCollection.SMCconstraints;
import com.example.MasterProjektAnbieter.Entity.SubModelCollection.SMCproperties;
import com.example.MasterProjektAnbieter.Entity.SubModelCollection.SMCpropertyChanges;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SMassurances {

    @Embedded
    public SMCproperties properties;

    @Embedded
    public SMCpropertyChanges propertyChanges;

    @Embedded
    public SMCconstraints constraints;



}
