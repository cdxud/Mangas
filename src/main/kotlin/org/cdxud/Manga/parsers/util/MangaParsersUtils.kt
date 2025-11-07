@file:JvmName("MangaParsersUtils")

package org.cdxud.Manga.parsers.util

import org.cdxud.Manga.parsers.model.MangaChapter
import org.cdxud.Manga.parsers.model.MangaListFilter
import kotlin.contracts.contract

public fun MangaListFilter?.isNullOrEmpty(): Boolean {
	contract {
		returns(false) implies (this@isNullOrEmpty != null)
	}
	return this == null || this.isEmpty()
}

public fun Collection<MangaChapter>.findById(chapterId: Long): MangaChapter? = find { x ->
	x.id == chapterId
}
