package com.mhp.coding.challenges.mapping.models.db.blocks

import com.mhp.coding.challenges.mapping.models.dto.blocks.ArticleBlockDto

open abstract class ArticleBlock(
    open val sortIndex: Int
) {
    abstract fun toDto(): ArticleBlockDto
}
