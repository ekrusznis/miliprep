package com.ai.miliprep.api.user.model

import org.jetbrains.annotations.NotNull
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "user")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    @Column(name = "name") @NotNull val name: String,
    @Column(name = "email") @NotNull val email: String,
    @Column(name = "password") @NotNull val password: String
)
