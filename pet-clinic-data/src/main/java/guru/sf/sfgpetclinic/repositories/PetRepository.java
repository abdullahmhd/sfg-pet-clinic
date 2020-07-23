package guru.sf.sfgpetclinic.repositories;

import guru.sf.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface PetRepository extends CrudRepository<Pet, Long> {
}
