package willy.springboot.petclinic.services;

import org.springframework.data.repository.CrudRepository;
import willy.springboot.petclinic.model.Owner;


public interface OwnerService extends CrudRepository<Owner, Long> {

}
