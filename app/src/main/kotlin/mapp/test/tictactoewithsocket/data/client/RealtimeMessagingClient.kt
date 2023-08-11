package mapp.test.tictactoewithsocket.data.client

import kotlinx.coroutines.flow.Flow
import mapp.test.tictactoewithsocket.data.models.GameState
import mapp.test.tictactoewithsocket.data.models.MakeTurn

interface RealtimeMessagingClient {
    fun getGameStateStream(): Flow<GameState>
    suspend fun sendAction(action: MakeTurn)
    suspend fun close()
}
