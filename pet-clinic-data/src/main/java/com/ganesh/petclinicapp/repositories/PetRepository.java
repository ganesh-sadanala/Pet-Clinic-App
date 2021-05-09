package com.ganesh.petclinicapp.repositories;

import com.ganesh.petclinicapp.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
