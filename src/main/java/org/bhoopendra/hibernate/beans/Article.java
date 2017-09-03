package org.bhoopendra.hibernate.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ARTICLE")
public class Article implements Serializable {

	private static final long serialVersionUID = 4274489901453149083L;
	@Id
	@GeneratedValue
	@Column(name = "ARTICLE_ID")
	private long articleId;

	@Column(name = "ARTICLE_TITLE")
	private String title;

	@Column(name = "ARTICLE_CONTENT")
	private String content;

	public Article() {
	}

	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", title=" + title + ", content=" + content + "]";
	}

	public Article(final String title, final String content) {
		super();
		this.title = title;
		this.content = content;
	}

	public Article(long articleId, String title, String content) {
		super();
		this.articleId = articleId;
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

	public long getArticleId() {
		return articleId;
	}

	public void setArticleId(long articleId) {
		this.articleId = articleId;
	}

}
