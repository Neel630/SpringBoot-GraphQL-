package com.example.graphql.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql.author.AuthorMutation;
import com.example.graphql.author.AuthorRepository;

@Component
public class BookMutation implements GraphQLMutationResolver {
	
	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	AuthorRepository authorRepository;
	
	public Book addBook(Book book) {
	System.out.println(book);
	Book myBook=new Book();
	//int id = book.getAuthor().getId();
//		if(authorRepository.existsById(id)) {
//			Author 
//			authorRepository.deleteById(book.getAuthor().getId());
//			return bookRepository.save(book);
//		}
	try {
		
		authorRepository.save(book.getAuthor());
		
		 myBook=bookRepository.save(book);
	}
	catch(Exception e) {
		System.out.print(e);
	}
	return myBook;
		
		
	}
}
