package com.app.anu.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.app.anu.model.Manager;
import com.app.anu.model.Pet;
import com.app.anu.model.PetCareCenter;
import com.app.anu.model.PetOwner;
import com.app.anu.model.Document;
import com.app.anu.model.PetService;
import com.app.anu.enums.PetServiceType;
import com.app.anu.converter.PetServiceTypeConverter;
import com.app.anu.converter.DurationConverter;
import com.app.anu.converter.UUIDToByteConverter;
import com.app.anu.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "PetOwner")
@Table(name = "\"PetOwner\"", schema =  "\"anu\"")
@Data
                        
public class PetOwner {
	public PetOwner () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"OwnerId\"", nullable = true )
  private Integer ownerId;
	  
  @Column(name = "\"OwnerName\"", nullable = true )
  private String ownerName;
  
	  
  @Column(name = "\"ContactPrimary\"", nullable = true )
  private String contactPrimary;
  
	  
  @Column(name = "\"ContactSecondary\"", nullable = true )
  private String contactSecondary;
  
	  
  @Column(name = "\"Address\"", nullable = true )
  private String address;
  
	  
  @Column(name = "\"Pincode\"", nullable = true )
  private String pincode;
  
  
  
  
   
	
@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"PetOwnerPets\"",
            joinColumns = @JoinColumn( name="\"OwnerId\""),
            inverseJoinColumns = @JoinColumn( name="\"PetId\""), schema = "\"anu\"")
private List<Pet> pets = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "PetOwner [" 
  + "OwnerId= " + ownerId  + ", " 
  + "OwnerName= " + ownerName  + ", " 
  + "ContactPrimary= " + contactPrimary  + ", " 
  + "ContactSecondary= " + contactSecondary  + ", " 
  + "Address= " + address  + ", " 
  + "Pincode= " + pincode 
 + "]";
	}
	
}