
package com.Dario.Porfolio.Controllers;


import com.Dario.Porfolio.models.Proyecto;
import com.Dario.Porfolio.models.Response;
import com.Dario.Porfolio.services.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

//    https://miporfolio-jpa.herokuapp.com/
@CrossOrigin(origins = "https://dariocoletto-ac579.web.app", maxAge=3600)
@RestController
@RequestMapping("/proyecto")
public class ProyectoController {
 
    @Autowired
    IProyectoService iProyectoService;

   
   @PostMapping("/add")
   public void add(@RequestBody Proyecto proyecto){
       iProyectoService.add(proyecto);
       System.out.print("proyecto agregado");
    }
   
   
    @PutMapping(value = "/update/{id_proyecto}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Response update(@PathVariable int id_proyecto,
                         @RequestBody Proyecto updatedProyecto){

        
        Proyecto currentProyecto= iProyectoService.get(id_proyecto);


        currentProyecto.setNombre_proyecto(updatedProyecto.getNombre_proyecto());
        currentProyecto.setUrl_logo(updatedProyecto.getUrl_logo());
        currentProyecto.setDescripcion(updatedProyecto.getDescripcion());
        currentProyecto.setTecnologias(updatedProyecto.getTecnologias());

        iProyectoService.update(currentProyecto);
       
        System.out.println("proyecto actualizado");
        return new Response("Proyecto Actualizado");
    }
   
   @DeleteMapping("/delete/{id_proyecto}")
   public void delete(@PathVariable int id_proyecto){
       
        iProyectoService.delete(id_proyecto);

        System.out.print("El proyecto fue eliminado");
    }
   

   @GetMapping("/getAll")
   public List<Proyecto> getAll(){
       return iProyectoService.getAll();
    }


    @GetMapping("/get/{id_proyecto}")
    public Proyecto get(@PathVariable int id_proyecto){

        return iProyectoService.get(id_proyecto);
    }
}
