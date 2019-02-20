package com.spring.security.securitydemo.service;

import com.spring.security.securitydemo.domain.Book;
import java.sql.SQLException;
import java.util.List;

public interface BookService{

  Book findById(Integer id) throws SQLException;

  List<Book> findAll() throws SQLException;

  void deleteById(Integer id) throws SQLException;

  void updateBook(Book book) throws SQLException;
}
