package com.ejercicio.Ejercicio.Service;

import com.ejercicio.Ejercicio.Model.BookRequest;
import com.ejercicio.Ejercicio.Persistence.Entity.Book;
import com.ejercicio.Ejercicio.Persistence.Repository.RepositoryBook;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ServiceBookImp implements ServiceBook {

    private final RepositoryBook repositoryBook;




    @Override
    public Book saveBook(BookRequest bookRequest) {
        Book book = new Book(
                bookRequest.getId(),
                bookRequest.getTitle(),
                bookRequest.getAuthor(),
                bookRequest.getIbsn(),
                bookRequest.getPublishedDate());

        return repositoryBook.save(book);
    }

    @Override
    public Book getBookById(Integer idBook) {
       return repositoryBook.findById(idBook).orElseThrow(()-> {throw new RuntimeException("Book not found");});
    }

    @Override
    public Book getBookByTittle(String title) {
        return  repositoryBook.findByTitle(title).orElseThrow(()-> {throw new RuntimeException("Book not found");});
    }
    @Override
    public Book getBookByAuthor(String author) {
        return  repositoryBook.findByAuthor(author).orElseThrow(()-> {throw new RuntimeException("Book not found");});
    }
    @Override
    public Book bookUpdate(Integer id, Book bookUpdate) {
        Book bookSearch = repositoryBook.findById(id).get();
        bookSearch.setTitle(bookUpdate.getTitle());
        bookSearch.setAuthor(bookUpdate.getAuthor());
        repositoryBook.save(bookSearch);
        return repositoryBook.save(bookSearch);
    }

    @Override
    public boolean deleteBook(Integer id) {

            try {
                repositoryBook.deleteById(id);
                return true;

            }catch (Exception e){
                return false;
            }
    }
}
