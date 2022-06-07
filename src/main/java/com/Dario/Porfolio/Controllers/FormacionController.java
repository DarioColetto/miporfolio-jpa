
package com.Dario.Porfolio.Controllers;

import com.Dario.Porfolio.models.Formacion;
import com.Dario.Porfolio.services.IFormacionService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "https://miporfolio-jpa.herokuapp.com/", maxAge=3600)

@RestController
@RequestMapping("/formacion")
public class FormacionController {

    
   @Autowired
   IFormacionService iFormacionService;
   
   @PostMapping("/add")
   public void add(@RequestBody Formacion formacion){
       iFormacionService.add(formacion);

       System.out.println("Formacion agregada");
    }
   
   
    @PutMapping("/update/{id_formacion}")
    public  void update(@PathVariable ("id_formacion") int id_formacion,
                                 @RequestBody Formacion updatedFormacion){
        
        Formacion currentFormacion= iFormacionService.get(id_formacion);

        currentFormacion.setNombre_institucion(updatedFormacion.getNombre_institucion());
        currentFormacion.setTitulo(updatedFormacion.getTitulo());
        currentFormacion.setDescripcion(updatedFormacion.getDescripcion());
        currentFormacion.setAno_inicio(updatedFormacion.getAno_inicio());
        currentFormacion.setAno_finalizacion(updatedFormacion.getAno_finalizacion());
        currentFormacion.setDuracion(updatedFormacion.getDuracion());
        currentFormacion.setUrl_logo(updatedFormacion.getUrl_logo());
        
        iFormacionService.update(currentFormacion);
       
        System.out.println("Formacion actualizada" );


    }


   @DeleteMapping("/delete/{id_formacion}")
   public void delete(@PathVariable("id_formacion") int id_formacion){
       
        iFormacionService.delete(id_formacion);
        System.out.println ("Formacion eliminada ");
    }
   
   @GetMapping("/get/{id_formacion}")
        public Formacion get(@PathVariable int id_formacion){

       return iFormacionService.get(id_formacion);
    }
   
   @GetMapping("/getAll")
   public List<Formacion> getAll(){
       return iFormacionService.getAll();
    }    


}
