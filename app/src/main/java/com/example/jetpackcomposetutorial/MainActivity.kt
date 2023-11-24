package com.example.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeImage()
                }
            }
        }
    }
}

@Composable
fun ArticleText(heading: String, paragraphOne: String, paragaraphTwo: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = heading,
            fontSize = 24.sp,
            lineHeight = 50.sp,
            modifier = modifier
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = paragraphOne,
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = paragaraphTwo,
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp)
            )
    }
}

@Composable
fun ComposeImage(modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.bg_compose_background)
    Column{
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
        )
        ArticleText(
            heading = stringResource(R.string.compose_heading),
            paragraphOne = stringResource(R.string.paragraph_one),
            paragaraphTwo = stringResource(R.string.paragraph_two)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposableArticlePreview() {
    JetpackComposeTutorialTheme {
        ComposeImage()
    }
}