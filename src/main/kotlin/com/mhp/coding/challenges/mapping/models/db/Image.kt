package com.mhp.coding.challenges.mapping.models.db
import com.mhp.coding.challenges.mapping.models.dto.ImageDto

import java.util.*

class Image(
    var url: String,
    var imageSize: ImageSize,
    override var id: Long,
    override var lastModified: Date,
    override var lastModifiedBy: String? = null

) : DBEntity {
        fun toDto(): ImageDto = ImageDto( id, url, imageSize )
}

enum class ImageSize {
    SMALL,
    MEDIUM,
    LARGE,
}
