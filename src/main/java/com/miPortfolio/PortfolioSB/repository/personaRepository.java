
package com.miPortfolio.PortfolioSB.repository;

import com.miPortfolio.PortfolioSB.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personaRepository extends JpaRepository <Persona, Long>{
  
}
