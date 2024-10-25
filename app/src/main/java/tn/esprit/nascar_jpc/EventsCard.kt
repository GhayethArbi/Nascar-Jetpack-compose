package tn.esprit.nascar_jpc

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp



@Composable
fun EventsCard(image:Int, title:Int, date:Int) {
    Card(
        colors = CardColors(
            contentColor = Color.White,
            containerColor = Color.White,
            disabledContentColor = Color.White,
            disabledContainerColor = Color.White
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        // add elevation for shadow effect
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        // apply rounded corners if needed
        shape = MaterialTheme.shapes.medium
    ) {
        Row(modifier= Modifier.padding(5.dp)) {
            Image(
                painter = painterResource(image),
                contentDescription = "news1",
                modifier = Modifier

                    .height(100.dp)

            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = stringResource(title),
                    style = MaterialTheme.typography.titleMedium, // Set appropriate text style
                    color = Color.Black
                )
                Text(
                    text = stringResource(date),
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color(0xFFFF0000)
                )
            }
        }
    }
}