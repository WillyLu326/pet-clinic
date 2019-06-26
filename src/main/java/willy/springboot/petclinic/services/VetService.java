package willy.springboot.petclinic.services;

import org.springframework.data.repository.CrudRepository;
import willy.springboot.petclinic.model.Vet;


public interface VetService extends CrudRepository<Vet, Long> {

}
