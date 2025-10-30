package empresaSpring.config;

import empresaSpring.entities.Cargo;
import empresaSpring.entities.Colaborador;
import empresaSpring.entities.Setor;
import empresaSpring.repositories.CargoRepository;
import empresaSpring.repositories.ColaboradorRepository;
import empresaSpring.repositories.SetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


import java.time.LocalDate;
import java.util.Arrays;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private CargoRepository cargoRepository;
    @Autowired
    private ColaboradorRepository colaboradorRepository;
    @Autowired
    private SetorRepository setorRepository;

    @Override
    public void run(String...args) throws Exception{
        Setor setor1 = new Setor(null,"Comercial");
        Setor setor2 = new Setor(null,"Administrativo");
        Setor setor3 = new Setor(null,"Financeiro");
        setorRepository.saveAll(Arrays.asList(setor1,setor2,setor3));


        Cargo cargo1 = new Cargo(null,"Representante Comercial","Vendedor externo",setor1);
        Cargo cargo2 = new Cargo(null,"Gerente geral","Gerencia Equipe de todos setores",setor2);
        Cargo cargo3 = new Cargo(null,"Gerente Financeiro","Gerencia financas da empresa",setor3);
        cargoRepository.saveAll(Arrays.asList(cargo1,cargo2,cargo3));

        Colaborador colaborador1 = new Colaborador(null,"Joao Freitas","235.541.486-58", LocalDate.parse("1987-01-26"),cargo1);
        Colaborador colaborador2 = new Colaborador(null,"Patricia Almeida","147.963.258-05",LocalDate.parse("1983-06-14"),cargo2);
        Colaborador colaborador3 = new Colaborador(null,"Suzane Goncalves","596.254.002-90",LocalDate.parse("1992-12-28"),cargo3);
        colaboradorRepository.saveAll(Arrays.asList(colaborador1,colaborador2,colaborador3));



    }
}
