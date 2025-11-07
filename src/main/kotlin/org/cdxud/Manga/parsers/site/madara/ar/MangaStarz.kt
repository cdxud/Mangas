package org.cdxud.Manga.parsers.site.madara.ar

import org.cdxud.Manga.parsers.MangaLoaderContext
import org.cdxud.Manga.parsers.MangaSourceParser
import org.cdxud.Manga.parsers.model.MangaParserSource
import org.cdxud.Manga.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGASTARZ", "Manga-Starz", "ar")
internal class MangaStarz(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGASTARZ, "manga-starz.com", pageSize = 10) {
	override val datePattern = "d MMMM، yyyy"
	override val stylePage = ""
}
