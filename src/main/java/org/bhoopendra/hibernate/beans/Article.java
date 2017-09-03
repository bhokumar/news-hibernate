package org.bhoopendra.hibernate.beans;

import java.io.Serializable;

public class Article implements Serializable {

	private static final long serialVersionUID = 4274489901453149083L;
	private long articleId;
	private String title;
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
