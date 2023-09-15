package com.ejercicio.Ejercicio.Controller;

import com.ejercicio.Ejercicio.Model.BookRequest;
import com.ejercicio.Ejercicio.Persistence.Entity.Book;
import com.ejercicio.Ejercicio.Service.ServiceBookImp;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor

public class ControllerBook {
    private final ServiceBookImp servicerBookImp;

    @PostMapping
    public ResponseEntity saveBook(@RequestBody BookRequest bookRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(servicerBookImp.saveBook(bookRequest));
    }

    @GetMapping("/{id}") //obtener id
    public ResponseEntity getBookById(@PathVariable("id") Integer idBook) {
        return  ResponseEntity.status( HttpStatus.OK).body(servicerBookImp.getBookById(idBook));
    }

    @GetMapping("/title/{title}") //obtener titulo
    public ResponseEntity getBookBytittle(@PathVariable("title") String title) {
        return ResponseEntity.status(HttpStatus.OK).body(servicerBookImp.getBookByTittle(title));
    }
    @GetMapping("/author/{author}") //obtener autor
    public ResponseEntity getBookByauthor(@PathVariable("author") String author) {
        return ResponseEntity.status(HttpStatus.OK).body(servicerBookImp.getBookByAuthor(author));
    }

    @PutMapping("/{id}") //actualizar
    public ResponseEntity bookUpdate(@PathVariable("id") Integer idBook, @RequestBody Book book) {
        return ResponseEntity.status(HttpStatus.OK).body(servicerBookImp.bookUpdate(idBook, book));}

    @DeleteMapping("/{id}")
    public ResponseEntity deleteBook(@PathVariable("id") Integer idBook) {
        boolean delete = servicerBookImp.deleteBook(idBook);
        if (delete) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }






}
