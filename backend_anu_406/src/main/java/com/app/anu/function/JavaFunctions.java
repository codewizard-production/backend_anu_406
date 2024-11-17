package com.app.anu.function;

import com.app.anu.model.Manager;
import com.app.anu.model.Pet;
import com.app.anu.model.PetCareCenter;
import com.app.anu.model.PetOwner;
import com.app.anu.model.Document;
import com.app.anu.model.PetService;
import com.app.anu.enums.PetServiceType;
import com.app.anu.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.anu.repository.PetServiceRepository;
import com.app.anu.repository.PetOwnerRepository;
import com.app.anu.repository.PetCareCenterRepository;
import com.app.anu.repository.ManagerRepository;
import com.app.anu.repository.DocumentRepository;
import com.app.anu.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
