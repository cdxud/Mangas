package org.cdxud.Manga.parsers.site.madara.ar

import org.cdxud.Manga.parsers.MangaLoaderContext
import org.cdxud.Manga.parsers.MangaSourceParser
import org.cdxud.Manga.parsers.model.MangaParserSource
import org.cdxud.Manga.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGALINKNET", "Link-Manga.com", "ar")
internal class MangaLinkNet(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGALINKNET, "link-manga.com", pageSize = 10)
