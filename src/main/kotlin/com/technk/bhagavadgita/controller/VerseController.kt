package com.technk.bhagavadgita.controller

import com.technk.bhagavadgita.service.VerseService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v2/verses")
class VerseController(
    private val verseService: VerseService
) {

    @GetMapping
    fun getVerses() =
        verseService.getAllVerses()
}