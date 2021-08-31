package com.mhp.coding.challenges.mapping.models.db.blocks

import com.mhp.coding.challenges.mapping.models.db.Image
import com.mhp.coding.challenges.mapping.models.db.ImageSize
import com.mhp.coding.challenges.mapping.models.dto.ImageDto
import com.mhp.coding.challenges.mapping.models.dto.blocks.GalleryBlockDto

class GalleryBlock(
    var images: List<Image?>,
    override val sortIndex: Int = 0,
) : ArticleBlock(sortIndex) {
    override fun toDto(): GalleryBlockDto {
        return GalleryBlockDto(images.map {
            it?.toDto() ?: ImageDto(-1, "", ImageSize.SMALL) },
            sortIndex)
    }
}
