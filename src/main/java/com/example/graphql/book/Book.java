package com.example.graphql.book;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

import com.example.graphql.author.Author;


//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Component
@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int pageCount;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="author_id",referencedColumnName = "id")
	

	@ManyToOne
    @JoinColumn(name="author_id")
	private Author author;
	
//	public Book() {}
//	
//	public Book(int id, String name, int pageCount, Author author) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.pageCount = pageCount;
//		this.author = author;
//	}
	
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

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
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", pageCount=" + pageCount + ", author=" + author + "]";
	} 
	
	
	
	
	
	
}
