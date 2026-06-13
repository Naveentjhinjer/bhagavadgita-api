package com.technk.bhagavadgita.service

import com.technk.bhagavadgita.entity.VerseDetail
import com.technk.bhagavadgita.repository.VerseDetailRepository
import org.springframework.stereotype.Service

@Service
class VerseDetailService(
    private val repository: VerseDetailRepository
) {

    fun getVerseDetail(
        chapterNumber: Int,
        verseNumber: Int
    ): VerseDetail? {

        return repository.findByChapterNumberAndVerseNumber(
            chapterNumber,
            verseNumber
        )
    }
}