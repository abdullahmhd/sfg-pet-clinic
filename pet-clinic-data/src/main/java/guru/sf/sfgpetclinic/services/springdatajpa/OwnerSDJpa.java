package guru.sf.sfgpetclinic.services.springdatajpa;

import guru.sf.sfgpetclinic.model.Owner;
import guru.sf.sfgpetclinic.repositories.OwnerRepository;
import guru.sf.sfgpetclinic.repositories.PetRepository;
import guru.sf.sfgpetclinic.repositories.PetTypeRepository;
import guru.sf.sfgpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@Profile("springdatajpa")
public class OwnerSDJpa implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpa(OwnerRepository ownerRepository, PetRepository petRepository,
                      PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return this.ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        this.ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long id) {
        return this.ownerRepository.findById(id).orElse(null);
    }

    @Override
    public Owner save(Owner owner) {
        return this.ownerRepository.save(owner);
    }

    @Override
    public void delete(Owner owner) {
        this.ownerRepository.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        this.ownerRepository.deleteById(id);
    }
}
