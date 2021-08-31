package com.mhp.coding.challenges.mapping.models.db.blocks

import com.mhp.coding.challenges.mapping.models.db.Image
import com.mhp.coding.challenges.mapping.models.db.ImageSize
import com.mhp.coding.challenges.mapping.models.dto.ImageDto
import com.mhp.coding.challenges.mapping.models.dto.blocks.ArticleBlockDto
import java.util.*
import com.mhp.coding.challenges.mapping.models.dto.blocks.ImageBlock as ImageBlockDto

class ImageBlock(
    var image: Image?,
    override val sortIndex: Int = 0,

) : ArticleBlock(sortIndex) {
    override fun toDto(): ImageBlockDto {
        return ImageBlockDto(
            image?.toDto() ?: ImageDto(-1, "", ImageSize.SMALL),
            sortIndex
        )
    }
}
