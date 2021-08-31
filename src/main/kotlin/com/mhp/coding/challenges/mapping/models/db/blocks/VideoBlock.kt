package com.mhp.coding.challenges.mapping.models.db.blocks

import com.mhp.coding.challenges.mapping.models.dto.blocks.VideoBlock as VideoBlockDto

class VideoBlock(
    var url: String,
    var type: VideoBlockType,
    override val sortIndex: Int = 0,
) : ArticleBlock(sortIndex) {
    override fun toDto(): VideoBlockDto {
        return VideoBlockDto(url, type, sortIndex)
    }
}

enum class VideoBlockType {
    YOUTUBE,
    VIMEO,
    TWITCH,
}
