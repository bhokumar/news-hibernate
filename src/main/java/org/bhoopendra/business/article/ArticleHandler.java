package org.bhoopendra.business.article;

import java.util.List;

import org.bhoopendra.dao.ArticleDAO;
import org.bhoopendra.dao.hibernate.ArticleDAOImpl;
import org.bhoopendra.hibernate.beans.Article;

public class ArticleHandler {
	
	
	private ArticleDAO articleDAO = new ArticleDAOImpl();
		
	public  Article saveArticlefinal(final Article article) {
		return articleDAO.saveArticle(article);
	}
	
	public List<Article> getAllArticles(){
		return articleDAO.getAllArticles();
	}

}
