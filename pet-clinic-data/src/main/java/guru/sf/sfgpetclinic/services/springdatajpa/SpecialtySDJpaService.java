package guru.sf.sfgpetclinic.services.springdatajpa;

import guru.sf.sfgpetclinic.model.Specialty;
import guru.sf.sfgpetclinic.repositories.SpecialtyRepository;
import guru.sf.sfgpetclinic.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@Profile("springdatajpa")
public class SpecialtySDJpaService implements SpecialtyService {

    private final SpecialtyRepository specialtyRepository;

    public SpecialtySDJpaService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Specialty> findAll() {
        Set<Specialty> specialties = new HashSet<>();
        this.specialtyRepository.findAll().forEach(specialties::add);
        return specialties;
    }

    @Override
    public Specialty findById(Long id) {
        return this.specialtyRepository.findById(id).orElse(null);
    }

    @Override
    public Specialty save(Specialty specialty) {
        return this.specialtyRepository.save(specialty);
    }

    @Override
    public void delete(Specialty specialty) {
        this.specialtyRepository.delete(specialty);
    }

    @Override
    public void deleteById(Long id) {
        this.specialtyRepository.deleteById(id);
    }
}
