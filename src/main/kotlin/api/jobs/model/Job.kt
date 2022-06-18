package com.ai.miliprep.api.jobs.model

import org.jetbrains.annotations.NotNull
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "job")
data class Job(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    @Column(name = "title") @NotNull val title: String,
    @Column(name = "description") @NotNull val description: String,
    @Column(name = "date_posted") @NotNull val datePosted: LocalDateTime
)
