package com.ai.miliprep.api.resumes.model

import com.ai.miliprep.api.user.model.User
import org.jetbrains.annotations.NotNull
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.Table

@Entity
@Table(name = "resume")
data class Resume(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    @Column(name = "resume") @NotNull val resume: String,
    @JoinColumn(name = "user_id") @NotNull val user: User
)
