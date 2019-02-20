package com.spring.security.securitydemo.resource;

import com.spring.security.securitydemo.domain.Book;
import com.spring.security.securitydemo.service.BookService;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BookResource{

  private final BookService bookService;

  @Autowired
  public BookResource(BookService bookService) {
    this.bookService = bookService;
  }

  @GetMapping("/findById/{id}")
  public ResponseEntity<Book> findById(@PathVariable("id") Integer id) throws SQLException {
    Book book = bookService.findById(id);
    return new ResponseEntity<>(book, HttpStatus.OK);
  }

  @PostMapping("/deleteById/{id}")
  public void removeById(@PathVariable("id") Integer id) throws SQLException {
    bookService.deleteById(id);
  }
}
