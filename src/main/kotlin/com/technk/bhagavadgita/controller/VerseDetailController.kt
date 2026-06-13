package com.technk.bhagavadgita.controller

import com.technk.bhagavadgita.entity.VerseDetail
import com.technk.bhagavadgita.service.VerseDetailService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v2")
class VerseDetailController(
    private val service: VerseDetailService
) {

    @GetMapping(
        "/chapters/{chapterNumber}/verses/{verseNumber}"
    )
    fun getVerseDetail(
        @PathVariable chapterNumber: Int,
        @PathVariable verseNumber: Int
    ): VerseDetail? {

        return service.getVerseDetail(
            chapterNumber,
            verseNumber
        )
    }
}