package com.technk.bhagavadgita.controller

import com.technk.bhagavadgita.entity.Verse
import com.technk.bhagavadgita.service.VerseService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v2/chapters")
class VerseController(
    private val verseService: VerseService
) {

    @GetMapping("/{chapterNumber}/verses")
    fun getVerses(
        @PathVariable chapterNumber: Int
    ): List<Verse> {

        return verseService
            .getVersesByChapter(chapterNumber)
    }
}