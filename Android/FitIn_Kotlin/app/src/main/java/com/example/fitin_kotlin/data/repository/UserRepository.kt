package com.example.fitin_kotlin.data.repository

import android.util.Log
import com.example.fitin_kotlin.data.model.network.request.RequestSignIn
import com.example.fitin_kotlin.data.model.network.request.RequestSignUp
import com.example.fitin_kotlin.data.remote.api.UserService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class UserRepository @Inject constructor(private val userService: UserService){

    suspend fun postSignUp(requestSignUp: RequestSignUp) = userService.postSignUp(requestSignUp)

    suspend fun postSignIn(requestSignIn: RequestSignIn) = userService.postSignIn(requestSignIn)


}