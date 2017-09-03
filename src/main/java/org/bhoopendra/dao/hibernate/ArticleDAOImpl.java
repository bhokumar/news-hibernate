package org.bhoopendra.dao.hibernate;

import java.util.List;

import org.bhoopendra.dao.ArticleDAO;
import org.bhoopendra.hibernate.beans.Article;
import org.bhoopendra.hibernate.conf.SessionFactoryCreator;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ArticleDAOImpl implements ArticleDAO {

	@Override
	public Article saveArticle(final Article article) {
		final Session session = SessionFactoryCreator.getSessionFactoryInstance().openSession();
		final Transaction transaction = session.beginTransaction();
		session.save(article);
		transaction.commit();
		return article;
	}

	@Override
	public List<Article> getAllArticles() {
		final Session session = SessionFactoryCreator.getSessionFactoryInstance().openSession();
		List<Article> articles = session.createQuery("from Article a order by a.articleId asc").list();
		return articles;
	}

	@Override
	public Article getArticle(final int articleId) {
		return null;
	}

}
