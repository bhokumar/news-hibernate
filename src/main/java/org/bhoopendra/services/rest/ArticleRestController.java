package org.bhoopendra.services.rest;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.bhoopendra.hibernate.beans.Article;

@Path("/article")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ArticleRestController {

	@GET
	public List<Article> getArticles() {
		List<Article> articles = new ArrayList<>();
		articles.add(new Article("economic slowdown", "cvontent is being written"));
		return articles;
	}
}
