package tn.esprit.nascar_jpc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tn.esprit.nascar_jpc.ui.theme.NascarJPCTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NascarJPCTheme {
                PreviewHome()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewHome() {
    Text(

        text = "hi there"
    )
    Column {
        MyToolbar()
        NavButtons()

        Divider(
            // Change color as needed
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f),
            // Change thickness as needed
            thickness = 1.dp,
            // Add margin if needed
            modifier = Modifier.padding(vertical = 5.dp)
        )
        News()


    }
}