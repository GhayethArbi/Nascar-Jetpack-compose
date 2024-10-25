package tn.esprit.nascar_jpc

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun NavButtons() {
    Row(    modifier = Modifier
        .fillMaxWidth(),

    ) {
        Button(
            onClick = {},
            modifier = Modifier.weight(1f),
            colors = ButtonDefaults.buttonColors(
                // Button background color
                containerColor = Color.White,
                // Text and icon color
                contentColor = Color.Black
            )
        ) {
            Text(
                "News",
                fontSize = 20.sp
            )
        }
        Button(
            onClick = {},
            modifier = Modifier.weight(1f),
            colors = ButtonDefaults.buttonColors(
                // Button background color
                containerColor = Color.White,
                // Text and icon color
                contentColor = Color.Black
            )
        ) {
            Text(
                "Events",
                fontSize = 20.sp
            )
        }
        Button(
            onClick = {},
            modifier = Modifier.weight(1f),
            colors = ButtonDefaults.buttonColors(
                // Button background color
                containerColor = Color.White,
                // Text and icon color
                contentColor = Color.Black
            )
        ) {
            Text(
                "Profile",
                fontSize = 20.sp
            )
        }
    }
}