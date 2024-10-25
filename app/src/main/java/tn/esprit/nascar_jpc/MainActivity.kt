package tn.esprit.nascar_jpc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
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
        NavigationScreen()
    }
}