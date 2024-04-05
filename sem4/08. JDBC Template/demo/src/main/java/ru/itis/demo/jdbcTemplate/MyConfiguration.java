package ru.itis.demo.jdbcTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class MyConfiguration {

    @Bean
    public JdbcTemplate jdbcTemplate(@Autowired DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//
//        dataSource.setDriverClassName("org.postgresql.Driver");
//        dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
//        dataSource.setUsername("postgres");
//        dataSource.setPassword("azat");
//
//        return dataSource;
//    }
}
