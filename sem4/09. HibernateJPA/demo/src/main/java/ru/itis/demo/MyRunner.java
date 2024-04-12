package ru.itis.demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.itis.demo.entity.User;

import java.util.List;

@Component
@RequiredArgsConstructor
public class MyRunner implements CommandLineRunner {

    private final EntityManager entityManager;
    @Override
    public void run(String... args) throws Exception {
//        entityManager.getTransaction().begin();
//        // Transient
//        User user = new User();
//        user.setName("Azat");
//        user.setSurname("Faskhtudinov");
//        user.setAge(23);
//
//        // Persistent
//        entityManager.persist(user);
//        entityManager.flush();
//        user.setName("new name");
//        entityManager.getTransaction().commit();
//        // Detached
//        user.setName("new name 2");

        // getting objects
        entityManager.getTransaction().begin();
        // Persistent
        User user = entityManager.find(User.class,5L);
        Query query = entityManager.createQuery("select user FROM User user");
        List<User> users = query.getResultList();
        user.setName("New name 3");
        entityManager.getTransaction().commit();
    }
}
