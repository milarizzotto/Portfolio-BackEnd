
package com.miPortfolio.PortfolioSB.service;

import com.miPortfolio.PortfolioSB.repository.personaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements iPersonaService {
    private personaRepository persRepository;
    
    @Autowired
    public PersonaService (personaRepository persRepository) {
        this.persRepository = persRepository;
    }
}
