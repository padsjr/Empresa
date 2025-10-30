package empresaSpring.controllers;

import empresaSpring.entities.Cargo;
import empresaSpring.services.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/cargo")
public class CargoController {
    @Autowired
    private CargoService cargoService;

    @GetMapping
    public ResponseEntity<List<Cargo>> findAll(){
        List<Cargo> list = cargoService.findAll();
        return ResponseEntity.ok().body(list);
    }
    @PostMapping
    public ResponseEntity<Cargo> insert(@RequestBody Cargo cargo){
        cargo = cargoService.insert(cargo);
        return ResponseEntity.ok().body(cargo);
    }
    @PutMapping
    public ResponseEntity<Cargo> update(@PathVariable Long id, @RequestBody Cargo cargo){
        cargo = cargoService.update(id, cargo);
        return ResponseEntity.ok().body(cargo);
    }
    @DeleteMapping
    public ResponseEntity<Void> delete(@PathVariable Long id){
        cargoService.delete(id);
        return ResponseEntity.noContent().build();
    }



}
