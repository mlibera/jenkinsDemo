package com.example.jenkinsDemo.model

import io.swagger.v3.oas.annotations.media.Schema
import jakarta.persistence.*
import lombok.Builder


@Entity
@Builder
@Table(name = "users")
@Schema(description = "Model for a User")
data class User(
    @field:Schema(description = "id for a User", example = "1", type = "Long", minimum = "1") @Id @GeneratedValue(
        strategy = GenerationType.IDENTITY
    ) val id: Long,
    @field:Schema(description = "username which user declare", example = "Mario", type = "String") var name: String,
    var email: String,
    var password: String
) {}