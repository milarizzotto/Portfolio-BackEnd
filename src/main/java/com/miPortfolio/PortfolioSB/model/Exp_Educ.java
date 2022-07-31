package com.miPortfolio.PortfolioSB.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Exp_Educ implements Serializable{
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String institucion;
    private String fecha_inic; 
    private String fecha_fin;
    private String rol;
    private String img_url;
    private String descrip;
    private String link;

    @Override
    public String toString() {
        return "Exp_Educ{" + "id=" + id + ", institucion=" + institucion + ", fecha_inic=" + fecha_inic + ", fecha_fin=" + fecha_fin + ", rol=" + rol + ", img_url=" + img_url + ", descrip=" + descrip + ", link=" + link + '}';
    }

    
    
    
}
