package com.example.learntogetherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.learntogetherapp.ui.theme.LearnTogetherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun Article(image: Painter, title: String, shortDesc: String, longDesc: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
        Text(
            text = title
        )
        Text(
            text = shortDesc
        )
        Text(
            text = longDesc
        )
    }
}

@Composable
fun ArticlePage(modifier: Modifier = Modifier) {
    Article(
        image = painterResource(id = R.drawable.bg_compose_background),
        title = stringResource(R.string.title_text),
        shortDesc = stringResource(R.string.shortDesc_text),
        longDesc = stringResource(R.string.longDesc_text)
    )
}

@Preview(showBackground = true)
@Composable
fun ArticlePagePreview() {
    LearnTogetherAppTheme {
        ArticlePage()
    }
}