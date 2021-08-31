package com.mhp.coding.challenges.mapping.mappers

import com.mhp.coding.challenges.mapping.models.db.Article
import com.mhp.coding.challenges.mapping.models.db.Image
import com.mhp.coding.challenges.mapping.models.db.blocks.ArticleBlock
import com.mhp.coding.challenges.mapping.models.db.blocks.GalleryBlock
import com.mhp.coding.challenges.mapping.models.db.blocks.ImageBlock
import com.mhp.coding.challenges.mapping.models.dto.ArticleDto
import com.mhp.coding.challenges.mapping.models.dto.ImageDto
import com.mhp.coding.challenges.mapping.models.dto.blocks.ArticleBlockDto
import com.mhp.coding.challenges.mapping.models.dto.blocks.GalleryBlockDto
import com.mhp.coding.challenges.mapping.models.dto.blocks.TextBlock
import org.springframework.stereotype.Component
import java.util.*

@Component
class ArticleMapper {
    fun map(article: Article?): ArticleDto {
        // TODO
        return article?.toDto() ?: ArticleDto(-1, "", "", "", emptyList<ArticleBlockDto>())
    }

    // Not part of the challenge / Nicht Teil dieser Challenge.
    fun map(articleDto: ArticleDto?): Article = Article(
        title = "An Article",
        blocks = emptySet(),
        id = 1,
        lastModified = Date()
    )
}