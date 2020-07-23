package guru.sf.sfgpetclinic.repositories;

import guru.sf.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface VetRepository extends CrudRepository<Vet, Long> {
}
