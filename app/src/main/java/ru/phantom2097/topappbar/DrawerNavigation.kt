package ru.phantom2097.topappbar

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DrawerHeader (

) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(Color.Blue)
            .padding(10.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center,

    ) {
        Text(
            text = "Menu",
            fontSize = 30.sp,
            color = Color.White,
        )
    }
}

@Composable
fun DrawerBody() {
    LazyColumn(modifier = Modifier.fillMaxWidth()) {
        items(5) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {

                    }.padding(10.dp),
                text = "Menu item $it",
                fontSize = 20.sp
            )
        }
    }
}