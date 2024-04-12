package ru.itis.demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public EntityManagerFactory entityManagerFactory(){
        return Persistence.createEntityManagerFactory("Itis");
    }

    @Bean
    public EntityManager entityManager(@Autowired EntityManagerFactory entityManagerFactory){
        return entityManagerFactory.createEntityManager();
    }
}
