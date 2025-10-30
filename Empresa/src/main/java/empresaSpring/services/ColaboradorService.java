package empresaSpring.services;

import empresaSpring.entities.Colaborador;
import empresaSpring.repositories.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColaboradorService {
    @Autowired
    private ColaboradorRepository colaboradorRepository;

    public List<Colaborador> findAll(){
        return colaboradorRepository.findAll();
    }
    public Colaborador insert(Colaborador colaborador){
        return colaboradorRepository.save(colaborador);
    }
    public Colaborador update(Long id,Colaborador colaborador){
        Colaborador entity = colaboradorRepository.getReferenceById(id);
        updateData(entity,colaborador);
        return colaboradorRepository.save(entity);
    }
    public void updateData(Colaborador entity, Colaborador colaborador){
        entity.setNome(colaborador.getNome());
        entity.setCargo(colaborador.getCargo());
        entity.setDataNascimento(colaborador.getDataNascimento());
    }
    public void delete(Long id){
        colaboradorRepository.deleteById(id);
    }
}
