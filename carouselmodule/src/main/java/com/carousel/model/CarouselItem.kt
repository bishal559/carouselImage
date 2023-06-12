package com.carousel.model

import androidx.annotation.DrawableRes
/**
 * Created by bishal on 12/06/2023.
 */
data class CarouselItem constructor(
    val id:Int?,
    val imageUrl: String? = null,
    @DrawableRes val imageDrawable: Int? = null,
    val caption: String? = null,
    val headers: Map<String, String>?
) {
    constructor() : this(null,null, null, null, null)

    constructor(id:Int?,imageUrl: String? = null) : this(
        id,
        imageUrl,
        null,
        null,
        null
    )

    constructor(imageUrl: String? = null) : this(
        null,
        imageUrl,
        null,
        null,
        null
    )

    constructor(imageUrl: String? = null, headers: Map<String, String>? = null) : this(
        null,
        imageUrl,
        null,
        null,
        headers
    )

    constructor(@DrawableRes imageDrawable: Int? = null) : this(
        null,
        null,
        imageDrawable,
        null,
        null
    )

    constructor(imageUrl: String? = null, caption: String? = null) : this(
        null,
        imageUrl,
        null,
        caption,
        null
    )

    constructor(
        imageUrl: String? = null,
        caption: String? = null,
        headers: Map<String, String>? = null
    ) : this(
        null,
        imageUrl,
        null,
        caption,
        headers
    )

    constructor(id:Int?,@DrawableRes imageDrawable: Int? = null, caption: String? = null) : this(
        null,
        null,
        imageDrawable,
        caption,
        null
    )
}
