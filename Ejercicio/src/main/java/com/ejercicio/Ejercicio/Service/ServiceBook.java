package com.ejercicio.Ejercicio.Service;

import com.ejercicio.Ejercicio.Model.BookRequest;
import com.ejercicio.Ejercicio.Persistence.Entity.Book;

public interface ServiceBook {



  Book saveBook(BookRequest bookRequest);

  Book getBookById(Integer idBook);


  Book getBookByTittle(String title);

  Book getBookByAuthor(String author);

  Book bookUpdate(Integer id, Book bookUpdate);

  boolean deleteBook(Integer id);

}