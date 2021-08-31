package com.mhp.coding.challenges.mapping.models.db.blocks
import com.mhp.coding.challenges.mapping.models.dto.blocks.TextBlock

class TextBlock(
    var text: String,
    override var sortIndex: Int = 0,
) : ArticleBlock(sortIndex) {
    override fun toDto(): TextBlock = TextBlock( text, sortIndex )
}
