package com.plub.data.repository.github

import com.plub.data.model.GithubRepoRes

interface GithubRemoteSource {
    suspend fun getRepos(owner: String): List<GithubRepoRes>
}