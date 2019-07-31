package sfg.sfgpetclinic.services;

import sfg.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName();
}
