package guru.sf.sfgpetclinic.repositories;

import guru.sf.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
