package com.example.graphql.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class AuthorMutation implements GraphQLMutationResolver {

	@Autowired
	AuthorRepository authorRepository;
	
	public Author addAuthor(Author author){
	
		return authorRepository.save(author);
		
	}
}
