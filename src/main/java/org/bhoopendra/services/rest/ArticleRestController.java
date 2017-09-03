package org.bhoopendra.services.rest;

import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.bhoopendra.business.article.ArticleHandler;
import org.bhoopendra.hibernate.beans.Article;

@Path("/article")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ArticleRestController {

	private static final Logger logger = Logger.getLogger(ArticleRestController.class.getName());

	@GET
	public List<Article> getArticles() {
		logger.info("Request started!");
		final long startTime = System.currentTimeMillis();
		List<Article> articles = ArticleHandler.getAllArticles();
		final long finishTime = System.currentTimeMillis();
		logger.info("Request Finished : "+(finishTime-startTime));
		return articles;
	}

	@POST
	public Article createArticle(final Article article) {
		logger.info("Request started!");
		final long startTime = System.currentTimeMillis();
		final Article response = ArticleHandler.saveArticlefinal(article);
		final long finishTime = System.currentTimeMillis();
		logger.info("Request Finished : "+(finishTime-startTime));
		return response;
	}

}
