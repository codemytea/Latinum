import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.avatar
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    var state by remember { mutableStateOf(0) }
    val titles = listOf("My Lessons", "Assigned To Me")

    MaterialTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            Box {
                Box(
                    modifier = Modifier
                        .padding(bottom = 25.dp)
                        .fillMaxWidth()
                        .aspectRatio(3f)
                        .clip(RoundedCornerShape(0, 0, 75, 75))
                        .background(Color.LightGray)
                        .align(Alignment.TopCenter)
                )
                Text(
                    text = "Leadership Ranking: 5",
                    modifier = Modifier.align(Alignment.TopCenter).padding(50.dp)
                )
                Image(
                    painter = painterResource(resource = Res.drawable.avatar),
                    contentDescription = stringResource(resource = Res.string.avatar),
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                        .align(Alignment.BottomCenter)

                )

            }
            TabRow(
                selectedTabIndex = state,
                backgroundColor = Color.White,
                contentColor = Color.Gray
            ) {
                titles.forEachIndexed { index, title ->
                    Tab(
                        selected = state == index,
                        onClick = { state = index },
                        text = {
                            Text(
                                text = title,
                                maxLines = 2,
                                overflow = TextOverflow.Ellipsis
                            )
                        }
                    )
                }
            }
            if (state == 0) {
                Card(
                    backgroundColor = Color.LightGray,
                    elevation = 3.dp,
                    border = BorderStroke(1.dp, Color.Black),
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(3f)
                        .padding(10.dp)
                ) {
                    Text(
                        text = "Lesson 1",
                        modifier = Modifier
                            .padding(16.dp),
                        textAlign = TextAlign.Justify,
                    )
                }
            }
        }
    }
}