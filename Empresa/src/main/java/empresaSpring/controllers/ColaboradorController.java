package empresaSpring.controllers;

import empresaSpring.entities.Colaborador;
import empresaSpring.services.ColaboradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/colaborador")
public class ColaboradorController {
    @Autowired
    private ColaboradorService colaboradorService;

    @GetMapping
    public ResponseEntity<List<Colaborador>> findAll(){
        List<Colaborador> list = colaboradorService.findAll();
        return ResponseEntity.ok().body(list);
    }
    @PostMapping
    public ResponseEntity<Colaborador> insert(Colaborador colaborador){
        colaborador = colaboradorService.insert(colaborador);
        return ResponseEntity.ok().body(colaborador);
    }
    @PutMapping
    public ResponseEntity<Colaborador> update(@PathVariable Long id, @RequestBody Colaborador colaborador){
        colaborador = colaboradorService.update(id, colaborador);
        return ResponseEntity.ok().body(colaborador);
    }
    @DeleteMapping
    public ResponseEntity<Void> delete(@PathVariable Long id){
        colaboradorService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
