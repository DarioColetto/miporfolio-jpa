package com.Dario.Porfolio.Controllers;


import com.Dario.Porfolio.models.Tecnologia;
import com.Dario.Porfolio.services.ITecnologiasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://miporfolio-jpa.herokuapp.com/", maxAge=3600)
@RestController
@RequestMapping("/tecnologia")
public class TecnologiaController {



    @Autowired
    ITecnologiasService iTecnologiasService;

    @PostMapping("/add")
    public void add(@RequestBody Tecnologia tecnologia){
        iTecnologiasService.add(tecnologia);

        System.out.print("tecnolgia agregada");
    }


    @PutMapping("/update/{id_tecnologia}")
    public void update(@PathVariable int id_tecnologia,
                               @RequestBody Tecnologia updatedTecnologia){


        Tecnologia currentTecnologia= iTecnologiasService.get(id_tecnologia);

        currentTecnologia.setNombre_tecnologia(updatedTecnologia.getNombre_tecnologia());
        currentTecnologia.setDescripcion(updatedTecnologia.getDescripcion());
        currentTecnologia.setNivel(updatedTecnologia.getNivel());


        iTecnologiasService.update(currentTecnologia);

        System.out.print("tecnologia actualizado");

    }

    @DeleteMapping("/delete/{id_tecnologia}")
    public void delete(@PathVariable int id_tecnologia){

        iTecnologiasService.delete(id_tecnologia);
        System.out.print("Tecnologia  eliminada");
    }


    @GetMapping("/getAll")
    public List<Tecnologia> getAll(){
        return iTecnologiasService.getAll();
    }


    @GetMapping("/get/{id_tecnologia}")
    public Tecnologia get(@PathVariable int id_tecnologia){

        return iTecnologiasService.get(id_tecnologia);
    }
}
