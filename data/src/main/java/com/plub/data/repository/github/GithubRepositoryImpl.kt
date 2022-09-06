package com.plub.data.repository.github

import com.plub.data.mapper.Mapper.mapperToGithubRepoList
import com.plub.domain.model.GithubRepo
import com.plub.domain.repository.GithubRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GithubRepositoryImpl @Inject constructor(
    private val githubRemoteSource: GithubRemoteSource
): GithubRepository {
    override suspend fun getRepos(owner: String): List<GithubRepo> {
        return mapperToGithubRepoList(githubRemoteSource.getRepos(owner))
    }
}