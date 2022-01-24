package com.dionlan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dionlan.data.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}