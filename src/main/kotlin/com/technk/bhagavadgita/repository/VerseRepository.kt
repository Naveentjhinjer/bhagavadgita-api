package com.technk.bhagavadgita.repository

import com.technk.bhagavadgita.entity.Verse
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface VerseRepository : JpaRepository<Verse, Long> {

    fun findByChapterNumberOrderByVerseNumber(
        chapterNumber: Int
    ): List<Verse>
}