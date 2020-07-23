package guru.sf.sfgpetclinic.repositories;

import guru.sf.sfgpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
