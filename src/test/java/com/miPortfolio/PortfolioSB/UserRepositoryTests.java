package com.miPortfolio.PortfolioSB;

import com.miPortfolio.PortfolioSB.model.User;
import com.miPortfolio.PortfolioSB.repository.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
    @Autowired
    UserRepo repo;

    @Test
    public void testCreateUser(){
        PasswordEncoder passwordEncoder= new BCryptPasswordEncoder();
        String rawPassword = "dmin";
        String encodePassword = passwordEncoder.encode(rawPassword);
        User newUser= new User("sy@admin.com",encodePassword);
        User savedUser=repo.save(newUser);
        assertThat(savedUser).isNotNull();
        assertThat(savedUser.getId()).isGreaterThan(0);
    }
}
