package org.zcorp.clicker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform