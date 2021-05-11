package com.ganesh.petclinicapp.services.map;

import com.ganesh.petclinicapp.model.Owner;
import com.ganesh.petclinicapp.model.Pet;
import com.ganesh.petclinicapp.services.OwnerService;
import com.ganesh.petclinicapp.services.PetService;
import com.ganesh.petclinicapp.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default","map"})
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetService petService;
    private final PetTypeService petTypeService;

    public OwnerServiceMap(PetService petService, PetTypeService petTypeService) {
        this.petService = petService;
        this.petTypeService = petTypeService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Owner save(Owner object) {
        if (object != null) {
            if (object.getPets() != null) {
                object.getPets().forEach(pet -> {
                    if (pet.getPetType() != null) {
                        if (pet.getPetType().getId() == null) {
                            petTypeService.save(pet.getPetType());
                        }
                    } else
                        throw new RuntimeException("Pet Type is required");
                    if (pet.getId() == null) {
                        petService.save(pet);
                    }
                });
            }
            return super.save(object);
        }
        return null;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
