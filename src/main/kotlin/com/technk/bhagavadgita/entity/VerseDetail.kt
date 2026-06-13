package com.technk.bhagavadgita.entity

import jakarta.persistence.*

@Entity
@Table(name = "verse_details")
data class VerseDetail(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(name = "chapter_number")
    val chapterNumber: Int,

    @Column(name = "verse_number")
    val verseNumber: Int,

    val verse: String,

    @Column(name = "word_meaning")
    val wordMeaning: String? = null,

    @Column(name = "verse_meaning")
    val verseMeaning: String? = null,

    @Column(name = "verse_description")
    val verseDescription: String? = null,

    @Column(name = "author_name")
    val authorName: String? = null
)