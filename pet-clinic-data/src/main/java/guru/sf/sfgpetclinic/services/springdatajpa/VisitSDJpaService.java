package guru.sf.sfgpetclinic.services.springdatajpa;

import guru.sf.sfgpetclinic.model.Visit;
import guru.sf.sfgpetclinic.repositories.VisitRepository;
import guru.sf.sfgpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSDJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        this.visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long id) {
        return this.visitRepository.findById(id).orElse(null);
    }

    @Override
    public Visit save(Visit visit) {
        return this.visitRepository.save(visit);
    }

    @Override
    public void delete(Visit visit) {
        this.visitRepository.delete(visit);
    }

    @Override
    public void deleteById(Long id) {
        this.visitRepository.deleteById(id);
    }
}
