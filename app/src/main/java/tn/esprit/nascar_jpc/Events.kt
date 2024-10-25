package tn.esprit.nascar_jpc

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun Events(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        EventsCard(R.drawable.ic_event1,R.string.event1,R.string.eventDate1)
        EventsCard(R.drawable.ic_event2,R.string.event2,R.string.eventDate2)
        EventsCard(R.drawable.ic_event1,R.string.event1,R.string.eventDate1)
        EventsCard(R.drawable.ic_event4,R.string.event4,R.string.eventDate4)
        EventsCard(R.drawable.ic_event1,R.string.event1,R.string.eventDate1)
        EventsCard(R.drawable.ic_event2,R.string.event2,R.string.eventDate2)
        EventsCard(R.drawable.ic_event1,R.string.event1,R.string.eventDate1)
        EventsCard(R.drawable.ic_event4,R.string.event4,R.string.eventDate4)

    }
}