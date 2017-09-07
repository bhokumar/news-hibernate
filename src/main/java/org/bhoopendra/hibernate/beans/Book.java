package org.bhoopendra.hibernate.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="BOOKS")
public class Book {

	@Id
	@Column(name="BOOK_ID")
	private String bookId;
	
	@Column(name="SUBJECT")
	private String subject;
	
	@ManyToMany
	@JoinTable(name="AUTHORS_BOOKS",joinColumns= {@JoinColumn(name="BOOK_ID")},inverseJoinColumns= {@JoinColumn(name="AUTHOR_ID")})
	private List<Author> authors;
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	
}
