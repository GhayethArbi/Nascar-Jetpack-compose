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
fun News() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        NewsCard(R.drawable.ic_news1, R.string.news1, R.string.newsDesc1)
        NewsCard(R.drawable.ic_news2, R.string.news2, R.string.newsDesc2)
        NewsCard(R.drawable.ic_news3, R.string.news3, R.string.newsDesc3)
    }


}