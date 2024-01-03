package com.example.retrofitmvvm.domain

import com.example.retrofitmvvm.domain.item.GameItem
import com.example.retrofitmvvm.repo.GameRepository
import javax.inject.Inject

class GetGamesUseCase @Inject constructor(private val gameRepository: GameRepository){

    suspend operator fun invoke(): List<GameItem> {
        return gameRepository.getGames().shuffled()
    }
}