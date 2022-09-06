package com.plub.cleanarchitecturepractice.di

import com.plub.domain.repository.GithubRepository
import com.plub.domain.usecase.GetGithubReposUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object UseCaseModule {

    @Provides
    fun providesGetGithubReposUseCase(repository: GithubRepository): GetGithubReposUseCase {
        return GetGithubReposUseCase(repository)
    }
}