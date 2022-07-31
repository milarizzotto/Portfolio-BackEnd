package com.miPortfolio.PortfolioSB.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Aptitud {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String nivel;
    private String descrip;
    
}
