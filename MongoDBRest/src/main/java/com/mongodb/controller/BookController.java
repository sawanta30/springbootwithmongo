package com.mongodb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.beans.Book;
import com.mongodb.service.BookRepository;

@RestController
@RequestMapping("/v1")
public class BookController {

	@Autowired
	BookRepository bookRepository;
	
	@RequestMapping(value="/book",method=RequestMethod.POST)
	public Book saveBook(@RequestBody Book book) {
		return bookRepository.save(book);
	}
	
	@RequestMapping(value="/book",method=RequestMethod.GET)
	public List<Book> getAllBooks(@RequestBody Book book) {
		return bookRepository.findAll();
	}
	
	@RequestMapping(value="/book/{id}",method=RequestMethod.GET)
	public Optional<Book> saveBook(@PathVariable String id) {
		return bookRepository.findById(id);
	}
	
	@RequestMapping(value="/book",method=RequestMethod.DELETE)
	public String deleteBook(@PathVariable String id) {
		String result;
		try {
		bookRepository.deleteById(id);
		result = "Book with id : "+id+" deleted successfully.";
		}catch(Exception e) {
			result = "Book with id : "+id+" was unable to delete.";
		}
		return result;
	}
	
	@RequestMapping(value="/book/{id}",method=RequestMethod.PUT)
	public Book saveBook(@RequestBody Book book ,@PathVariable String id) {
		book.setId(id);
		return bookRepository.save(book);
	}
}
