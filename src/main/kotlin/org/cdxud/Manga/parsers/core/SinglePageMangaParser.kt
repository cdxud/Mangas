package org.cdxud.Manga.parsers.core

import org.cdxud.Manga.parsers.InternalParsersApi
import org.cdxud.Manga.parsers.MangaLoaderContext
import org.cdxud.Manga.parsers.model.Manga
import org.cdxud.Manga.parsers.model.MangaListFilter
import org.cdxud.Manga.parsers.model.MangaParserSource
import org.cdxud.Manga.parsers.model.SortOrder

@InternalParsersApi
public abstract class SinglePageMangaParser(
	context: MangaLoaderContext,
	source: MangaParserSource,
) : AbstractMangaParser(context, source) {

	final override suspend fun getList(offset: Int, order: SortOrder, filter: MangaListFilter): List<Manga> {
		if (offset > 0) {
			return emptyList()
		}
		return getList(order, filter)
	}

	public abstract suspend fun getList(order: SortOrder, filter: MangaListFilter): List<Manga>
}
