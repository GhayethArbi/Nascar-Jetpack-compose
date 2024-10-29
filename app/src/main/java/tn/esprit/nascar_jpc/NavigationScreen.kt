package tn.esprit.nascar_jpc

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun NavigationScreen(navController: NavHostController) {
    //val navController = rememberNavController() // Create a NavController
    Column(modifier = Modifier.background(color = Color.White)) {
        NavButtons(navController)
        HorizontalDivider(
            modifier = Modifier.padding(vertical = 5.dp),
            thickness = 1.dp,
            // Add margin if needed
            // Change color as needed
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)
            // Change thickness as needed
        )
        NavHost(navController = navController, startDestination = "news") {
            composable("news") {
                News()
            }
            composable("events") {
                Events()
            }
            composable("profile")
            {
                Profile()
            }
            composable("about"){
                AboutApp()
            }


        }
    }
}