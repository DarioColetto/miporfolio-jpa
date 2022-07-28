package com.Dario.Porfolio.Controllers;

import com.Dario.Porfolio.models.About;
import com.Dario.Porfolio.services.IAboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "https://dariocoletto-ac579.web.app", maxAge=3600)

@RestController
@RequestMapping("/about")
public class AboutController {



    @Autowired
    IAboutService iAboutService;


    @PutMapping("/update/{id_about}")
    public  void update(@PathVariable ("id_about") int id_about,
                                 @RequestBody About updatedAbout){

        About currentAbout= iAboutService.get(id_about);


        currentAbout.setNombre(updatedAbout.getNombre());
        currentAbout.setDescripcion(updatedAbout.getDescripcion());
        currentAbout.setFoto_perfil(updatedAbout.getFoto_perfil());
        currentAbout.setTitulo((updatedAbout.getTitulo()));
        currentAbout.setEmail(updatedAbout.getEmail());
        currentAbout.setTel(updatedAbout.getTel());

        iAboutService.update(currentAbout);

        System.out.println("About actualizada" );


    }


    @GetMapping("/get/{id_about}")
    public About get(@PathVariable int id_about){

        return iAboutService.get(id_about);
    }



}
