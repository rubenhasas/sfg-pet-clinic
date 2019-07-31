package sfg.sfgpetclinic.services;

import sfg.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet saveOwner(Vet vet);

    Set<Vet> findAll();
}
