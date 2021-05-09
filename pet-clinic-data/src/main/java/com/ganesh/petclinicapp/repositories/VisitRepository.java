package com.ganesh.petclinicapp.repositories;

import com.ganesh.petclinicapp.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
