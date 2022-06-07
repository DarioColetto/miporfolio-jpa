package com.Dario.Porfolio.Controllers;



import com.Dario.Porfolio.models.Experiencia;
import com.Dario.Porfolio.services.IExperienciaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://miporfolio-jpa.herokuapp.com/", maxAge=3600)

@RestController
@RequestMapping("/experiencia")
public class ExperienciaController {


    @Autowired
    IExperienciaService iExperienciaService;

    @PostMapping("/add")
    public void add(@RequestBody Experiencia experiencia){
        iExperienciaService.add(experiencia);

        System.out.print("experiencia agregada");
    }


    @PutMapping("/update/{id_experiencia}")
    public void update(@PathVariable int id_experiencia,
                               @RequestBody Experiencia updatedExperiencia){


        Experiencia currentExperiencia = iExperienciaService.get(id_experiencia);

        currentExperiencia.setNombre_empresa(updatedExperiencia.getNombre_empresa());
        currentExperiencia.setPuesto(updatedExperiencia.getPuesto());
        currentExperiencia.setDescripcion(updatedExperiencia.getDescripcion());
        currentExperiencia.setAno_inicio(updatedExperiencia.getAno_inicio());
        currentExperiencia.setAno_finalizacion(updatedExperiencia.getAno_finalizacion());
        currentExperiencia.setWeb(updatedExperiencia.getWeb());
        currentExperiencia.setUrl_logo(updatedExperiencia.getUrl_logo());

        iExperienciaService.update(currentExperiencia);

        System.out.print("Experiencia actualizada");
     }

    @DeleteMapping("/delete/{id_experiencia}")
    public void delete(@PathVariable int id_experiencia){

        iExperienciaService.delete(id_experiencia);

        System.out.print("Experiencia eliminada");
    }


    @GetMapping("/getAll")
    public List<Experiencia> getAll(){
        return iExperienciaService.getAll();
    }


    @GetMapping("/get/{id_experiencia}")
    public Experiencia get(@PathVariable int id_experiencia){

        return iExperienciaService.get(id_experiencia);
    }
}
