package org.cdxud.Manga.parsers.site.madara.ar

import org.cdxud.Manga.parsers.Broken
import org.cdxud.Manga.parsers.MangaLoaderContext
import org.cdxud.Manga.parsers.MangaSourceParser
import org.cdxud.Manga.parsers.model.MangaParserSource
import org.cdxud.Manga.parsers.site.madara.MadaraParser

@Broken("Website is down or domain has been changed")
@MangaSourceParser("MANGARBIC", "MangaArabic", "ar")
internal class Mangarbic(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGARBIC, "lekmanga.net") {
	override val postReq = true
	override val datePattern = "yyyy/MM/dd"
}
