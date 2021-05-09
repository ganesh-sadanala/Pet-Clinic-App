package com.ganesh.petclinicapp.repositories;

import com.ganesh.petclinicapp.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
