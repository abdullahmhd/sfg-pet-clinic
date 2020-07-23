package guru.sf.sfgpetclinic.services.springdatajpa;

import guru.sf.sfgpetclinic.model.PetType;
import guru.sf.sfgpetclinic.repositories.PetTypeRepository;
import guru.sf.sfgpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }


    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        this.petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long id) {
        return this.petTypeRepository.findById(id).orElse(null);
    }

    @Override
    public PetType save(PetType petType) {
        return this.petTypeRepository.save(petType);
    }

    @Override
    public void delete(PetType petType) {
        this.petTypeRepository.delete(petType);
    }

    @Override
    public void deleteById(Long id) {
        this.petTypeRepository.deleteById(id);
    }
}
