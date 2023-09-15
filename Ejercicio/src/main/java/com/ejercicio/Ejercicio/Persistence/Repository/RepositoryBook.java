package com.ejercicio.Ejercicio.Persistence.Repository;

import com.ejercicio.Ejercicio.Persistence.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepositoryBook extends JpaRepository<Book, Integer> {
    Optional<Book> findByTitle(String title);

    Optional<Book> findByAuthor(String author);
}
