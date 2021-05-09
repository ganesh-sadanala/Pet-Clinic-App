package com.ganesh.petclinicapp.repositories;

import com.ganesh.petclinicapp.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
