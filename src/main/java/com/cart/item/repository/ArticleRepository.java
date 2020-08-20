package com.cart.item.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cart.item.model.Article;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "article", path="article")
public interface ArticleRepository extends CrudRepository<Article, Long>{

}
