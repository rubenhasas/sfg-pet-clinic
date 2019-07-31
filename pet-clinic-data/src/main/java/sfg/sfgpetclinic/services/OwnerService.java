package sfg.sfgpetclinic.services;

import sfg.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName();

    Owner findById(Long id);

    Owner saveOwner(Owner owner);

    Set<Owner> findAll();
}
