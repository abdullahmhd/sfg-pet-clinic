package guru.sf.sfgpetclinic.services.map;

import guru.sf.sfgpetclinic.model.Specialty;
import guru.sf.sfgpetclinic.model.Vet;
import guru.sf.sfgpetclinic.services.SpecialtyService;
import guru.sf.sfgpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet save(Vet vet) {
        if(vet.getSpecialties() != null && vet.getSpecialties().size() > 0) {
            vet.getSpecialties().forEach(specialty -> {
                if(specialty.getId() == null) {
                    Specialty savedSpecialty = this.specialtyService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(vet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
