package empresaSpring.services;

import empresaSpring.entities.Setor;
import empresaSpring.repositories.SetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetorService {
    @Autowired
    private SetorRepository setorRepository;

    public List<Setor> findAll(){
        return setorRepository.findAll();
    }
    public Setor insert(Setor setor){
        return setorRepository.save(setor);
    }
    public Setor update(Long id, Setor setor){
        Setor entity = setorRepository.getReferenceById(id);
        updateData(entity,setor);
        return setorRepository.save(entity);
    }
    public void updateData(Setor entity, Setor setor){
        entity.setNome(setor.getNome());
        entity.setCargos(setor.getCargos());
    }
    public void delete(Long id){
        setorRepository.deleteById(id);
    }
}
