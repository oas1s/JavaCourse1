package ru.itits.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.itits.demo.entity.Book;
import ru.itits.demo.repository.EntityManagerRepository;
import ru.itits.demo.repository.SpecificationBookRepository;

import java.util.List;

import static ru.itits.demo.repository.SpecificationBookRepository.hasAuthor;
import static ru.itits.demo.repository.SpecificationBookRepository.titleContains;

@Component
@RequiredArgsConstructor
public class MyRunner implements CommandLineRunner {

    private final EntityManagerRepository entityManagerRepository;
    private final SpecificationBookRepository specificationBookRepository;

    @Override
    public void run(String... args) throws Exception {
//        List<Book> books = entityManagerRepository.findBooksByAuthorNameAndTitle("Azat","title");
//        System.out.println(books);

        List<Book> books = specificationBookRepository.findAll(hasAuthor("Azat").and(titleContains("title")));
        System.out.println(books);
    }
}
