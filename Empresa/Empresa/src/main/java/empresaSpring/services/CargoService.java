package empresaSpring.services;

import empresaSpring.entities.Cargo;
import empresaSpring.repositories.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoService {

    @Autowired
    private CargoRepository cargoRepository;

    public List<Cargo> findAll() {
        return cargoRepository.findAll();
    }
    public Cargo insert(Cargo cargo) {
        return cargoRepository.save(cargo);
    }
    public Cargo update(Long id,Cargo cargo) {
        Cargo entity = cargoRepository.getReferenceById(id);
        updateData(entity,cargo);
        return cargoRepository.save(entity);
    }

    private void updateData(Cargo entity, Cargo cargo) {
        entity.setNome(cargo.getNome());
        entity.setFuncao(cargo.getFuncao());
        entity.setSetor(cargo.getSetor());
    }
    public void delete(Long id) {
        cargoRepository.deleteById(id);
    }
}
