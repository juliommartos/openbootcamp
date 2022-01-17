package com.jmm.obrestdatajpa;

import com.jmm.obrestdatajpa.entities.Book;
import com.jmm.obrestdatajpa.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class ObRestDatajpaApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(ObRestDatajpaApplication.class, args);
        BookRepository repository = context.getBean(BookRepository.class);

        Book book1 = new Book(null, "Sinhue, el Egipcio", "Frances", 344, 23.22, LocalDate.of(2018, 2, 18), true);
        Book book2 = new Book(null, "1984", "George Well", 344, 23.22, LocalDate.of(2018, 2, 18), true);

        repository.save(book1);
        repository.save(book2);

        //repository.deleteById(1L);
    }

}
