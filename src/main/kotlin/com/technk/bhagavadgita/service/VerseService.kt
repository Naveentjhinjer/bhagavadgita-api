package com.technk.bhagavadgita.service

import com.technk.bhagavadgita.entity.Verse
import com.technk.bhagavadgita.exception.ResourceNotFoundException
import com.technk.bhagavadgita.repository.VerseRepository
import org.springframework.stereotype.Service

@Service
class VerseService(
    private val verseRepository: VerseRepository
) {

    fun getVersesByChapter(
        chapterNumber: Int
    ): List<Verse> {

        val verses = verseRepository
            .findByChapterNumberOrderByVerseNumber(chapterNumber)

        if (verses.isEmpty()) {
            throw ResourceNotFoundException(
                "No verses found for chapter $chapterNumber"
            )
        }

        return verses
    }
}