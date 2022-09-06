package com.plub.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.plub.domain.model.GithubRepo
import com.plub.domain.usecase.GetGithubReposUseCase
import com.plub.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getGithubReposUseCase: GetGithubReposUseCase
): BaseViewModel() {

    private val _githubRepositories = MutableLiveData<List<GithubRepo>>()
    val githubRepositories: LiveData<List<GithubRepo>> = _githubRepositories

    fun getGithubRepositories(owner: String) {
        getGithubReposUseCase(owner, viewModelScope) {
            _githubRepositories.value = it
        }
    }
}