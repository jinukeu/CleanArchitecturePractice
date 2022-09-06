package com.plub.data.model

import com.plub.domain.model.GithubRepo

data class GithubRepoRes(
    val name: String,
    val id: String,
    val date: String,
    val url: String
)
