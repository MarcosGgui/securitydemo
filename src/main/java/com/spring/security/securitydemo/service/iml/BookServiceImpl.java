package com.spring.security.securitydemo.service.iml;

import com.spring.security.securitydemo.domain.Book;
import com.spring.security.securitydemo.repository.BookRepository;
import com.spring.security.securitydemo.service.BookService;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{

  @Autowired
  private BookRepository bookRepository;

  @Override
  public Book findById(Integer id) throws SQLException {
    Optional<Book> bookOptional = bookRepository.findById(id);
    Book book = null;
    if (bookOptional.isPresent()) {
      book = bookOptional.get();
    }
    return book;
  }

  @Override
  public List<Book> findAll() throws SQLException {
    return bookRepository.findAll();
  }

  @Override
  public void deleteById(Integer id) throws SQLException {
    bookRepository.deleteById(id);
  }

  @Override
  public void updateBook(Book book) throws SQLException {
    bookRepository.save(book);
  }
}
