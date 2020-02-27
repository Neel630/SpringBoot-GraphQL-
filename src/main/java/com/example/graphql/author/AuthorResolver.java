package com.example.graphql.author;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class AuthorResolver implements GraphQLQueryResolver {

	@Autowired
	AuthorRepository authorRepository;
	
	public List<Author> getAuthors() {
		return authorRepository.findAll();
	}
	
	public Optional<Author> getAuthor(int id) {
		return authorRepository.findById(id);
	}
}
