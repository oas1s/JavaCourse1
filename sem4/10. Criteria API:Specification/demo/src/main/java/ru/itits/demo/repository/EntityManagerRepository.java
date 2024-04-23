package ru.itits.demo.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.itits.demo.entity.Book;

import java.util.List;

@Repository
public class EntityManagerRepository {

    @Autowired
    EntityManager em;

    public List<Book> findBooksByAuthorNameAndTitle(String authorName, String title) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Book> cq = cb.createQuery(Book.class);

        Root<Book> book = cq.from(Book.class);
        Predicate authorNamePredicate = cb.equal(book.get("author"), authorName);
        Predicate titlePredicate = cb.like(book.get("title"), "%" + title + "%");
        cq.where(authorNamePredicate, titlePredicate);

        TypedQuery<Book> query = em.createQuery(cq);
        return query.getResultList();
    }

}