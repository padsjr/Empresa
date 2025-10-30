package empresaSpring.controllers;

import empresaSpring.entities.Setor;
import empresaSpring.services.SetorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/setor")
public class SetorController {
    @Autowired
    private SetorService setorService;

    @GetMapping
    public ResponseEntity<List<Setor>> findAll(){
        List<Setor> setors = setorService.findAll();
        return ResponseEntity.ok(setors);
    }
    @PostMapping
    public ResponseEntity<Setor> insert(Setor setor){
        setor = setorService.insert(setor);
        return ResponseEntity.ok(setor);
    }
    @PutMapping
    public ResponseEntity<Setor> update(@PathVariable Long id, @RequestBody Setor setor){
        setor = setorService.update(id, setor);
        return ResponseEntity.ok(setor);
    }
    @DeleteMapping
    public ResponseEntity<Void> delete(@PathVariable Long id){
        setorService.delete(id);
        return ResponseEntity.ok().build();
    }

}
