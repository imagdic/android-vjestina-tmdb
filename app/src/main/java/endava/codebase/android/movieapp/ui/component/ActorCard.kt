package endava.codebase.android.movieapp.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

// imports

data class ActorCardViewState(
    val imageUrl: String,
    val name: String,
    val character: String,
)

@Composable
fun ActorCard(
    actorCardViewState: ActorCardViewState,
    modifier: Modifier = Modifier,
){
}

@Preview
@Composable
fun ActorCardPreview() {
    MovieAppTheme {
        ActorCard(
            ActorCardViewState = ActorCardViewState(
                name = "Robert Downey Jr.",
                character = "Tony Stark/Iron Man"
            )
        )
    }
}