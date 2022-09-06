package com.plub.data.repository.github

import com.plub.data.model.GithubRepoRes
import com.plub.data.service.GithubService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GithubRemoteSourceImpl @Inject constructor(
    private val githubService: GithubService
) : GithubRemoteSource {
    override suspend fun getRepos(owner: String): List<GithubRepoRes> {
        return githubService.getRepos(owner)
    }
}