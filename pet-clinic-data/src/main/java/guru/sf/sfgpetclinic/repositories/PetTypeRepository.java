package guru.sf.sfgpetclinic.repositories;

import guru.sf.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
