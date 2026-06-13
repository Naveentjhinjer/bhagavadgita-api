package com.technk.bhagavadgita.repository

import com.technk.bhagavadgita.entity.Verse
import org.springframework.data.jpa.repository.JpaRepository

interface VerseRepository : JpaRepository<Verse, Long>