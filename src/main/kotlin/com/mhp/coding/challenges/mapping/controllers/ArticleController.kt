package com.mhp.coding.challenges.mapping.controllers

import com.fasterxml.jackson.databind.ObjectMapper
import com.mhp.coding.challenges.mapping.models.dto.ArticleDto
import com.mhp.coding.challenges.mapping.services.ArticleService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/article")
class ArticleController(
    private val articleService: ArticleService
) {
    @GetMapping
    fun list(): String = articleService.list()

    @GetMapping("/{id}")
    fun details(@PathVariable id: Long): ResponseEntity<String> = articleService.articleForId(id)

    @PostMapping
    fun create(@RequestBody articleDto: ArticleDto): ArticleDto = articleService.create(articleDto)
}
