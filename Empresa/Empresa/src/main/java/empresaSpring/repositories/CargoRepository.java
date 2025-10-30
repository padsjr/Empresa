package empresaSpring.repositories;

import empresaSpring.entities.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargo,Long> {

}
