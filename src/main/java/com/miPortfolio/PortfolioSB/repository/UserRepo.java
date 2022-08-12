package com.miPortfolio.PortfolioSB.repository;

import com.miPortfolio.PortfolioSB.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Integer> {

    Optional<User> findByEmail(String email);
}
