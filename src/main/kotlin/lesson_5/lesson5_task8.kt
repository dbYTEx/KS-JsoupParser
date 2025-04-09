package org.example.lesson_5

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

fun main() {
    val doc: Document =
        Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/")
            .get()
    val quoteLines: Elements = doc.select(".sc-2aegk7-2")
    for (quoteLine: Element in quoteLines) {
        println(quoteLine.text())
    }
}