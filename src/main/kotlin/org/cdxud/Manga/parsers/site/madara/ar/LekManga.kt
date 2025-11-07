package org.cdxud.Manga.parsers.site.madara.ar

import org.cdxud.Manga.parsers.MangaLoaderContext
import org.cdxud.Manga.parsers.MangaSourceParser
import org.cdxud.Manga.parsers.model.MangaParserSource
import org.cdxud.Manga.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGALEK", "LekManga", "ar")
internal class LekManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGALEK, "lekmanga.net", pageSize = 10)
