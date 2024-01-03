package com.example.retrofitmvvm.repo

import com.example.retrofitmvvm.data.remote.GameService
import com.example.retrofitmvvm.domain.item.GameItem
import com.example.retrofitmvvm.domain.item.toGameItem
import javax.inject.Inject

class GameRepository @Inject constructor(private val gameService: GameService) {
    suspend fun getGames(): List<GameItem> {
        return gameService.getGames().map {
            it.toGameItem()
        }
    }
}