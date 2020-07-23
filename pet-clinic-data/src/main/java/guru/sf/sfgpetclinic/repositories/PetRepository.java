package guru.sf.sfgpetclinic.repositories;

import guru.sf.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
