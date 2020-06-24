package com.kodiers.petclinic.services;

import com.kodiers.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
