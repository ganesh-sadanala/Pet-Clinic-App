package com.ganesh.petclinicapp.services;

import com.ganesh.petclinicapp.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
