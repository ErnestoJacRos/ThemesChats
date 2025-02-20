package com.jacrosdevs.themeschats.utils

import com.jacrosdevs.themeschats.models.MessageData

val listOfResponses = listOf<String>(
    "Hola",
    "Que tal",
    "Buen dia",
    "Adios",
    "Que bien",
    "Que mal",
    "Un gusto",
    "No me digas",
    "No me gusta",
    "Eso me encanta"
)

fun automaticResponse(): MessageData {
    val randomResponse = listOfResponses.random()

    val response: MessageData = MessageData(
        isMine = false,
        text = randomResponse
    )
    return response
}