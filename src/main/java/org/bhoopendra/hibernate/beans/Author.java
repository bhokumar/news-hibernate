package org.bhoopendra.hibernate.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="AUTHORS")
public class Author {
	@Id
	@Column(name="AUTHOR_ID")
	private String authorId;
	
	@Column(name="AUTHOR_NAME")
	private String authorName;
	
	@ManyToMany(mappedBy="authors")
	private List<Book> books;

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

}
