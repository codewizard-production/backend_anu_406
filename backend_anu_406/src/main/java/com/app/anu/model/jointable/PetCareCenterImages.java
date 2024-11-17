package com.app.anu.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.anu.model.Manager;
import com.app.anu.model.Pet;
import com.app.anu.model.PetCareCenter;
import com.app.anu.model.PetOwner;
import com.app.anu.model.Document;
import com.app.anu.model.PetService;
import com.app.anu.enums.PetServiceType;
import com.app.anu.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterImages")
@Table(schema = "\"anu\"", name = "\"PetCareCenterImages\"")
@Data
public class PetCareCenterImages{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"DocId\"")
    private Integer docId;
 
}