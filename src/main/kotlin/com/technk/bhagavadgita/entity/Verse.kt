package com.technk.bhagavadgita.entity

import jakarta.persistence.*

@Entity
@Table(name = "verses")
data class Verse(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(name = "verse_number")
    val verseNumber: Int,

    @Column(name = "verse_text")
    val verseText: String
)
