package org.cdxud.Manga.parsers

import org.cdxud.Manga.parsers.config.ConfigKey
import org.cdxud.Manga.parsers.config.MangaSourceConfig

internal class SourceConfigMock : MangaSourceConfig {

	override fun <T> get(key: ConfigKey<T>): T = key.defaultValue
}