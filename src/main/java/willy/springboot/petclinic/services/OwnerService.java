package willy.springboot.petclinic.services;

import willy.springboot.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
    
}
