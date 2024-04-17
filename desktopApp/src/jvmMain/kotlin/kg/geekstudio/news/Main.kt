package kg.geekstudio.news

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import kg.geekstudio.news.ui.HomeContent

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "News") {
        HomeContent()
    }
}