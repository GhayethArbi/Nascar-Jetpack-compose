package tn.esprit.nascar_jpc

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyToolbar() {

    TopAppBar(title = { Text(text = "Nascar") },
        navigationIcon = {
            IconButton(onClick = { /* Handle back action */ }) {
                Icon(
                    painter = painterResource(R.drawable.ic_dehaze),
                    contentDescription = "Menu",
                    tint = Color.White
                )
            }
        },

        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Black,       // Background color
            titleContentColor = Color.White,   // Title color
            actionIconContentColor = Color.White// Icon color


        )




    )
}