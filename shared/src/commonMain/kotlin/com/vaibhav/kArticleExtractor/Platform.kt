package com.vaibhav.kArticleExtractor

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform