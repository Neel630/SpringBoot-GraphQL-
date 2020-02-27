package com.example.graphql.author;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.example.graphql.book.Book;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
//	@OneToMany
//	@JoinColumn(name="book_id",referencedColumnName = "id")
//	private List<Book> book;
	
	

	public Author() {}
	
	public Author(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	
//	public List<Book> getBook() {
//		return book;
//	}
//
//	public void setBook(List<Book> book) {
//		this.book = book;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
