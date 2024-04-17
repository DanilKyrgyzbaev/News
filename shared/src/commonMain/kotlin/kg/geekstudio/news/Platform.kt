package kg.geekstudio.news

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform