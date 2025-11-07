package org.cdxud.Manga.parsers

import org.junit.jupiter.params.provider.EnumSource
import org.cdxud.Manga.parsers.model.MangaParserSource

// Change 'names' to test specified parsers
@EnumSource(MangaParserSource::class, names = [], mode = EnumSource.Mode.INCLUDE)
internal annotation class MangaSources
