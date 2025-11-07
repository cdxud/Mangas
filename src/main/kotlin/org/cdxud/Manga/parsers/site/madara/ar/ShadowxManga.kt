package org.cdxud.Manga.parsers.site.madara.ar

import org.cdxud.Manga.parsers.Broken
import org.cdxud.Manga.parsers.MangaLoaderContext
import org.cdxud.Manga.parsers.MangaSourceParser
import org.cdxud.Manga.parsers.model.MangaParserSource
import org.cdxud.Manga.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("SHADOWXMANGA", "ShadowXManga", "ar")
internal class ShadowxManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SHADOWXMANGA, "www.shadowxmanga.com") {
	override val datePattern = "yyyy/MM/dd"
}
