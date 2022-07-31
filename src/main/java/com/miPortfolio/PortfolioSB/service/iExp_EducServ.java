
package com.miPortfolio.PortfolioSB.service;

import com.miPortfolio.PortfolioSB.model.Exp_Educ;
import java.util.List;

public interface iExp_EducServ {
    public List<Exp_Educ> verExp_Educs();
    public void  agregarExp_Educ (Exp_Educ expEd);
    public void borrarExp_Educ (Long Id);
    public Exp_Educ buscarExp_Educ (Long Id);
    public void actualizarExp_Educ (Exp_Educ expEd);
}
