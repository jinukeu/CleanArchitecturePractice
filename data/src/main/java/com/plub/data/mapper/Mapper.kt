package com.plub.data.mapper

import com.plub.data.model.GithubRepoRes
import com.plub.domain.model.GithubRepo

object Mapper {
    fun mapperToGithubRepoList(githubRepoResList: List<GithubRepoRes>): List<GithubRepo> {
        return githubRepoResList.map { GithubRepo(
            it.name, it.url
        ) }
    }
}