package space.stanton.starter

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform