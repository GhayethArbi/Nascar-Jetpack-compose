package tn.esprit.nascar_jpc

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Profile(){
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth().padding(5.dp)){
        Image(
            painter = painterResource(R.drawable.ic_account_circle),
            contentDescription = "profileImage",
            modifier = Modifier.height(150.dp).width(150.dp),
            colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color.Black) // Apply gray tint

        )
        Text(
            text = "Name Here",
            modifier = Modifier
                .fillMaxWidth() // equivalent to match_parent
                .padding(10.dp) // margin around the text
            ,
            color = Color.Black,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center // equivalent to gravity center


        )
        Text(text="Email Here",
                modifier = Modifier
                .fillMaxWidth() // Equivalent to match_parent
            .padding(10.dp), // Margin around the text

            color = Color.Black,
            fontSize = 18.sp,
            textAlign = TextAlign.Center // Equivalent to gravity center
                     )


    }
}