package com.example.twoproject.repository;

import com.example.twoproject.entity.Article;
import org.springframework.data.repository.CrudRepository;
import java.util.ArrayList;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    @Override
    ArrayList<Article> findAll(); // Iterable → ArrayList 수정
}