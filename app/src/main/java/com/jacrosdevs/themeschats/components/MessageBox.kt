package com.jacrosdevs.themeschats.components

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.jacrosdevs.themeschats.models.MessageData

@Composable
fun MessageBox(
    modifier: Modifier = Modifier,
    listOfMessages: List<MessageData>,
    scrollState: ScrollState
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .verticalScroll(state = scrollState)
        //.background(MaterialTheme.colorScheme.secondaryContainer)
        //.weight(1F) //para que tenga el mismo peso
    ) {
        listOfMessages.forEach {
            MessageCard(
                message = it
            )
        }


    }
}