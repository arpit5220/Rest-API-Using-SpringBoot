package com.api.book.bookrestbook.services;

//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.bookrestbook.dao.BookRepository;
import com.api.book.bookrestbook.entities.Book;

@Component
public class BookService {
    
     // private static List<Book> list=new ArrayList<>();

      // static{
      //   list.add(new Book(12,"java XYZ","Arpit"));
      //   list.add(new Book(36,"c++ XYZ","katiyar"));
      //   list.add(new Book(78,"python","Mojo"));
      // }

      @Autowired
      private BookRepository bookRepository;

      // get all books
      public List<Book> getAllBooks()
      {
        //return list;
        List<Book> list=(List<Book>)this.bookRepository.findAll();
        return list;
      }
     
      //get single book by id
      public Book getBookById(int id)
      {
        Book book=null;
        try
        {
            //  book=list.stream().filter(e->e.getId()==id).findFirst().get();

            book=this.bookRepository.findById(id);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
         return book;
      }

      // adding the book
      public Book addBook(Book b)
      {
        // list.add(b);
        // return b;
        Book result=bookRepository.save(b);
        return result;
      }

      // delete book
      public void deletebook(int bid)
      {
          // list=list.stream().filter(book->book.getId()!=bid).  
          // collect(Collectors.toList());

          bookRepository.deleteById(bid);
      }

      // update book
      public void updatebook(Book book,int bookId)
      {
        //  list.stream().map(b->{
        //     if(b.getId()==bookId)
        //     {
        //         b.setTitle(book.getTitle());
        //         b.setAuthor(book.getAuthor());
        //     }
        //     return b;
        // }).collect(Collectors.toList());
         
        book.setId(bookId);
        bookRepository.save(book);

      }
}
