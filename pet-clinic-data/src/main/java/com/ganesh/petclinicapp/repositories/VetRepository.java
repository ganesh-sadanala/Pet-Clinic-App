package com.ganesh.petclinicapp.repositories;

import com.ganesh.petclinicapp.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
