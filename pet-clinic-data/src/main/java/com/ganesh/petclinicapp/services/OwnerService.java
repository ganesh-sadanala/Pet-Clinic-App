package com.ganesh.petclinicapp.services;

import com.ganesh.petclinicapp.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
