package com.plub.cleanarchitecturepractice.di

import com.plub.data.repository.github.GithubRemoteSource
import com.plub.data.repository.github.GithubRemoteSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {

    @Singleton
    @Provides
    fun providesGithubRemoteSource(source: GithubRemoteSourceImpl): GithubRemoteSource {
        return source
    }
}