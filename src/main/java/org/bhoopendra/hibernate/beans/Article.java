package org.bhoopendra.hibernate.beans;

import java.io.Serializable;

public class Article implements Serializable{

	private static final long serialVersionUID = 4274489901453149083L;
	
	private String title;
	private String content;
	public Article() {
	}

	@Override
	public String toString() {
		return "Article [title=" + title + ", content=" + content + "]";
	}

	public Article(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	

}
