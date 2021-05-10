package com.ganesh.petclinicapp.services.map;

import com.ganesh.petclinicapp.model.Owner;
import com.ganesh.petclinicapp.model.Visit;
import com.ganesh.petclinicapp.services.OwnerService;
import com.ganesh.petclinicapp.services.VisitService;

import java.util.Set;

public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {

    private final VisitService visitService;

    public VisitServiceMap(VisitService visitService) {
        this.visitService = visitService;
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public Visit save(Visit object) {
        if(object.getPet() == null || object.getPet().getOwner() == null || object.getPet().getId() == null)
            throw new RuntimeException("Invalid Visit");
        return super.save(object);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}
