package com.miPortfolio.PortfolioSB.service;

import com.miPortfolio.PortfolioSB.model.Exp_Educ;
import com.miPortfolio.PortfolioSB.repository.Exp_EducRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Exp_EducService implements iExp_EducServ {
    //QUEREMOS TRAER EL REPOSITORIO A ESTE SERVICE, ENTONCES:
    //ATRIBUTO

    private final Exp_EducRepository exp_EducRepository;

    //CONSTRUCTOR
    @Autowired //inyecta depencia
    public Exp_EducService(Exp_EducRepository exp_EducRepository) {
        this.exp_EducRepository = exp_EducRepository;
    }

    //MËTODOS
    @Override
    public List<Exp_Educ> verExp_Educs() {
        return exp_EducRepository.findAll();
    }

    @Override
    public void borrarExp_Educ(Long Id) {
        exp_EducRepository.deleteById(Id);
    }

    @Override
    public Exp_Educ buscarExp_Educ(Long Id) {
        return exp_EducRepository.findById(Id).orElse(null);
    }

    @Override
    public void agregarExp_Educ(Exp_Educ expEd) {
        exp_EducRepository.save(expEd);
    }

    @Override
    public void actualizarExp_Educ(Exp_Educ expEd) {
        exp_EducRepository.save(expEd);
    }

}
