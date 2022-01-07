package ru.geekbrains.data

import io.reactivex.rxjava3.core.Single

class GitHubUserRepositoryImpl : GitHubUserRepository {

    private val gitHubApi = GitHubApiFactory.create()

    override fun getUsers(): Single<List<GitHubUser>> {
         return gitHubApi.fetchUsers()
    }

    override fun getUserByLogin(login: String): Single<GitHubUser> {
        return gitHubApi.fetchUserByLogin(login)
    }
}