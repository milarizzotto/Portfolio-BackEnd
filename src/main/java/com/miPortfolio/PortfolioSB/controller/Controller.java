package com.miPortfolio.PortfolioSB.controller;

import com.miPortfolio.PortfolioSB.model.Exp_Educ;
import com.miPortfolio.PortfolioSB.service.iExp_EducServ;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping ("/exp_educ")
public class Controller{
    @Autowired
    private final iExp_EducServ exp_EducServ;

    public Controller(iExp_EducServ exp_EducServ) {
        this.exp_EducServ = exp_EducServ;
    }

    @PostMapping ("/nuevo")
   public void agregarExp_Educ (@RequestBody Exp_Educ expEd) {
            exp_EducServ.agregarExp_Educ(expEd);
    }
    @PutMapping ("/actualizar")
   public void actualizarExp_Educ (@RequestBody Exp_Educ expEd) {
            exp_EducServ.actualizarExp_Educ(expEd);
    }
    @GetMapping ("/ver")
    @ResponseBody
    public List <Exp_Educ> verExp_Educs () {
        return exp_EducServ.verExp_Educs();
    }
     @GetMapping ("/buscar/{id}")
    @ResponseBody
    public Exp_Educ buscarExp_Educ(@PathVariable Long id) {
       return exp_EducServ.buscarExp_Educ(id);
    }
    
    @DeleteMapping ("/borrar/{id}")
public void borrarExp_Educ (@PathVariable Long id) {
    exp_EducServ.borrarExp_Educ(id);
}

}
    
