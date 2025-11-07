package org.cdxud.Manga.parsers.site.madara.ar

import org.cdxud.Manga.parsers.Broken
import org.cdxud.Manga.parsers.MangaLoaderContext
import org.cdxud.Manga.parsers.MangaSourceParser
import org.cdxud.Manga.parsers.model.MangaParserSource
import org.cdxud.Manga.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGASPARK", "Manga-Spark", "ar")
internal class Mangaspark(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGASPARK, "manga-spark.com", pageSize = 10) {
	override val postReq = true
	override val datePattern = "d MMMM، yyyy"
}
