package org.bhoopendra.dao;

import java.util.List;

import org.bhoopendra.hibernate.beans.Article;

public interface ArticleDAO {
	Article saveArticle(final Article article);
	List<Article> getAllArticles();
	Article getArticle(final int articleId);
}
