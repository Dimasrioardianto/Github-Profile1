package id.ac.polbeng.ardianto.githubprofile.services

import id.ac.polbeng.ardianto.githubprofile.models.GithubUser
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface GithubUserService {
    @GET("users/{login}") // Replace with the actual endpoint
    fun loginUser(
        @Header("Authorization") token: String,
        @Path("login") userLogin: String
    ): Call<GithubUser>
}
