package Lesson_5

import org.jsoup.Jsoup

fun main() {
    val url = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"
        val document = Jsoup.connect(url).get()
        val quotes = document.select("")
        for (quote in quotes) {
            println(quote.text())
        }

    }