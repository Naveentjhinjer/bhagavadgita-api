package com.technk.bhagavadgita.repository

import com.technk.bhagavadgita.entity.VerseDetail
import org.springframework.data.jpa.repository.JpaRepository

interface VerseDetailRepository : JpaRepository<VerseDetail, Long> {

    fun findByChapterNumberAndVerseNumber(
        chapterNumber: Int,
        verseNumber: Int
    ): VerseDetail?
}