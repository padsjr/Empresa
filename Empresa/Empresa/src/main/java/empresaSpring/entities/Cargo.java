package empresaSpring.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_cargo")
public class Cargo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String funcao;

    @ManyToOne
    @JoinColumn(name = "setor_id")
    private Setor setor;


    public Cargo() {
    }

    public Cargo(Long id, String nome, String funcao, Setor setor) {
        this.id = id;
        this.nome = nome;
        this.funcao = funcao;
        this.setor = setor;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }


}

