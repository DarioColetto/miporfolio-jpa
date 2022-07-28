package com.Dario.Porfolio.Controllers;




import com.Dario.Porfolio.models.Social;
import com.Dario.Porfolio.services.ISocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge=3600)
@RestController
@RequestMapping("/social")
public class SocialController {

    @Autowired
     ISocialService iSocialService;

    @PostMapping("/add")
    public void add(@RequestBody Social social){
        iSocialService.add(social);
        System.out.print("Social agregado");
    }


    @PutMapping("/update/{id_social}")
    public void update(@PathVariable int id_social,
                               @RequestBody Social updatedSocial){



        Social curretnSocial= iSocialService.get(id_social);

        curretnSocial.setNombre_social(updatedSocial.getNombre_social());
        curretnSocial.setBootstrap_class(updatedSocial.getBootstrap_class());
        curretnSocial.setUrl_social(updatedSocial.getUrl_social());


        iSocialService.update(curretnSocial);

        System.out.print("Social actualizada");
    }

    @DeleteMapping("/delete/{id_social}")
    public void delete(@PathVariable int id_social){

        iSocialService.delete(id_social);

        System.out.print("Social fue eliminado");
    }


    @GetMapping("/getAll")
    public List<Social> getAll(){
        return iSocialService.getAll();
    }


    @GetMapping("/get/{id_social}")
    public Social get(@PathVariable int id_social){

        return iSocialService.get(id_social);
    }


}
