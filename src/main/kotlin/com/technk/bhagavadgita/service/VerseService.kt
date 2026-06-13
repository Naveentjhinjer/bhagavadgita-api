package com.technk.bhagavadgita.service

import com.technk.bhagavadgita.entity.Verse
import com.technk.bhagavadgita.repository.VerseRepository
import org.springframework.stereotype.Service

@Service
class VerseService(
    private val repository: VerseRepository
) {

    fun getAllVerses(): List<Verse> {
        return repository.findAll()
    }
}