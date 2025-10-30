package empresaSpring.repositories;

import empresaSpring.entities.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColaboradorRepository extends JpaRepository<Colaborador,Long> {
}
