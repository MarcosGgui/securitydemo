package com.spring.security.securitydemo.repository;

import com.spring.security.securitydemo.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
