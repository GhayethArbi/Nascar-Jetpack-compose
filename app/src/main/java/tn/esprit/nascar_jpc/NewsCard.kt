package tn.esprit.nascar_jpc

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun NewsCard(image: Int, title: Int, desc: Int) {
    Card(

        colors =CardDefaults.cardColors(
            containerColor = Color.White,
            contentColor = Color.White
        ),
        modifier = Modifier
            .fillMaxWidth() // equivalent to match_parent
            .padding(8.dp), // equivalent to layout_margin
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp), // add elevation for shadow effect
        shape = MaterialTheme.shapes.medium // apply rounded corners if needed
    ) {
        Column ( // Use Column to stack elements vertically
            modifier = Modifier.fillMaxWidth() // Fill width of the card
        ) {
            Image(
                painter = painterResource(image),
                contentDescription = "news1",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp).clip(MaterialTheme.shapes.medium)

            )
            Spacer(modifier = Modifier.height(8.dp)) // spacing between title and content

            Text(
                text = stringResource(title),
                modifier = Modifier.padding(horizontal = 16.dp), // Padding only for text
                style = MaterialTheme.typography.titleMedium, // Set appropriate text style
                color = Color.Black
            )
            Text(
                text = stringResource(desc),
                modifier = Modifier.padding(
                    top = 8.dp,
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp
                ), // Padding only for text
                style = MaterialTheme.typography.bodyMedium, // Set appropriate text style
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}