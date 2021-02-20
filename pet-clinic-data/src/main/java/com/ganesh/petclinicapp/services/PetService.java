package com.ganesh.petclinicapp.services;

import com.ganesh.petclinicapp.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
