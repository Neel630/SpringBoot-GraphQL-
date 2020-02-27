package com.example.graphql.book;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class BookResolver implements GraphQLQueryResolver {
		
	@Autowired
	BookRepository bookRepository;
	
	public List<Book> getBooks() {
		return bookRepository.findAll();
	}
	
	public Optional<Book> getBook(int id) {
		return bookRepository.findById(id);
	}
}
