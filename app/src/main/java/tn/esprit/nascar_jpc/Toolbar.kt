package tn.esprit.nascar_jpc

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import kotlin.system.exitProcess

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyToolbar(navController: NavHostController) {
    val showDialog = remember { mutableStateOf(false) }
    TopAppBar(
        title = { Text(text = "Nascar") },
        navigationIcon = {
            IconButton(onClick = { /* Handle back action */ }) {
                Icon(
                    painter = painterResource(R.drawable.ic_dehaze),
                    contentDescription = "Menu",
                    tint = Color.White
                )
            }
        },
        //to add menu as drop down
        actions = {
            IconButton(onClick = { navController.navigate("about") }) {
                Icon(
                    painter = painterResource(R.drawable.ic_info),
                    contentDescription = "More options",
                    tint = Color.White
                )
            }
            IconButton(onClick = {showDialog.value = true }) {
                Icon(
                    painter = painterResource(R.drawable.ic_logout),
                    contentDescription = "Menu",
                    tint = Color.White
                )
            }

        },
        // Dropdown menu




        //add color to toolbar
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Black,       // Background color
            titleContentColor = Color.White,   // Title color
            actionIconContentColor = Color.White// Icon color


        )




    )
// State to control the visibility of the dialog


    // AlertDialog

    if (showDialog.value) {
        AlertDialog(
            onDismissRequest = { showDialog.value = false }, // Dismiss the dialog
            title = { Text(text = "Logout") }, // Title of the dialog
            text = { Text(text = "Are you sure you want to logout ?") }, // Content of the dialog
            confirmButton = {
                    Button(onClick = {
                        // Exit the app by finishing the activity
                       exitProcess(0)
                    }) {
                        Text("Yes") // Confirm button
                    }
            },
            dismissButton = {
                Button(onClick = { showDialog.value = false }) {
                    Text("Cancel") // Dismiss button
                }
            }
        )
    }
}