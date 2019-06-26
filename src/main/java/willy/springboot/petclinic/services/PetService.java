package willy.springboot.petclinic.services;

import org.springframework.data.repository.CrudRepository;
import willy.springboot.petclinic.model.Pet;


public interface PetService extends CrudRepository<Pet, Long> {

}
