package ru.itits.demo.repository;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ru.itits.demo.entity.Book;

@Repository
public interface SpecificationBookRepository extends JpaRepository<Book, Long>, JpaSpecificationExecutor<Book> {

    public static Specification<Book> hasAuthor(String author) {
        return (book, cq, cb) -> cb.equal(book.get("author"), author);
    }

    public static Specification<Book> titleContains(String title) {
        return (book, cq, cb) -> cb.like(book.get("title"), "%" + title + "%");
    }

}
