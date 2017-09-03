package org.bhoopendra.dao.hibernate;

import java.util.List;

import org.bhoopendra.dao.ArticleDAO;
import org.bhoopendra.hibernate.beans.Article;
import org.bhoopendra.hibernate.conf.SessionFactoryCreator;
import org.hibernate.Session;

public class ArticleDAOImpl implements ArticleDAO {

	@Override
	public Article saveArticle(final Article article) {
		final Session session = SessionFactoryCreator.getSessionFactoryInstance().openSession();
		session.save(article);
		return article;
	}

	@Override
	public List<Article> getAllArticles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Article getArticle(final int articleId) {
		// TODO Auto-generated method stub
		return null;
	}

}
