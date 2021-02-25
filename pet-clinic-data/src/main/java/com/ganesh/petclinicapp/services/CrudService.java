package com.ganesh.petclinicapp.services;

import java.util.Set;

// Mimic CrudRepository
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findBy(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
