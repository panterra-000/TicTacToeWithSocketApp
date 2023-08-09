package mapp.test.tictactoewithsocket.maincontent

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import mapp.test.tictactoewithsocket.ui.theme.TicTacToeWithSocketTheme

@Composable
fun MainContent() {
    TicTacToeWithSocketTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        }
    }
}
