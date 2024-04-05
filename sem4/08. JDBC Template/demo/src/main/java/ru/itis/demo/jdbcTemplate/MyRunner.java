package ru.itis.demo.jdbcTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private PersonDAO personDAO;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        jdbcTemplate.execute("""
            CREATE TABLE IF NOT EXISTS Person (
                id serial primary key,
                name varchar(255),
                age varchar(255),
                email varchar(255)
            );
        """);
        personDAO.save(Person.builder().age(23).name("Azat").email("some@mail.ru").build());
        personDAO.save(Person.builder().age(23).name("Azat").email("some@mail.ru").build());
        System.out.println(personDAO.show(1));
        System.out.println(personDAO.index());
        System.out.println("Delete method executed");
        personDAO.delete(1);
        System.out.println(personDAO.index());
    }
}
