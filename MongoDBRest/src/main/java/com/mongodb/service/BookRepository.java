package com.mongodb.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import com.mongodb.beans.Book;

@Service
public interface BookRepository extends MongoRepository<Book, String> {

}
