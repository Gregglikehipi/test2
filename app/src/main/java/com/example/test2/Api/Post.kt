package com.example.test.Api

data class Post(
    val id: String,
    val name: String?,
    val effect: String?,
    val sideEffects: String?,
    val characteristics: String?,
    val time: String?,
    val difficulty: String,
    val ingredients: List<Ingredients>?,
    val inventors: List<Inventors>?,
    val manufacturer: String?,
)

data class Ingredients(
    val id: String,
    val name: String?,
)

data class Inventors(
    val id: String,
    val firstname: String?,
    val lastName: String?
)