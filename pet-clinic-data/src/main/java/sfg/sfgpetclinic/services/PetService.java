package sfg.sfgpetclinic.services;

import sfg.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet savePet(Pet pet);

    Set<Pet> findAll();
}
