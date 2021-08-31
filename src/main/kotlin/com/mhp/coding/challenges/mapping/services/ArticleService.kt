package com.mhp.coding.challenges.mapping.services

import com.fasterxml.jackson.databind.ObjectMapper
import com.mhp.coding.challenges.mapping.repositories.ArticleRepository
import com.mhp.coding.challenges.mapping.mappers.ArticleMapper
import com.mhp.coding.challenges.mapping.models.db.Article
import com.mhp.coding.challenges.mapping.models.dto.ArticleDto
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service


@Service
class ArticleService(
    private val mapper: ArticleMapper,
) {
    fun list(): String {
        val articles = ArticleRepository.all()
        // TODO
        // List(Article) --> List(ArticleDto)
        return ObjectMapper().writeValueAsString(articles.map{ mapper.map(it) })
    }

    fun articleForId(id: Long): ResponseEntity<String> {
        // TODO
        // Article --> ArticleDto
        try {
            val article = ArticleRepository.findBy(id)

            // Simulating repository.exists(id), actually the line below is not the correct way
            if (article != null) {
                return ResponseEntity.ok(ObjectMapper().writeValueAsString(mapper.map(article)))
            }
            return ResponseEntity.notFound().build()
        } catch (e: Exception) {
            return ResponseEntity.notFound().build()
        }
    }

    fun create(articleDto: ArticleDto): ArticleDto {
        val article = mapper.map(articleDto)
        ArticleRepository.create(article)
        return mapper.map(article)
    }
}
