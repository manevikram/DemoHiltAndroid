package com.demo.hilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class UserApplication : Application() {

    //@Inject
    //lateinit var userRepository : UserRepository

    override fun onCreate() {
        super.onCreate()
      //  userRepository.saveUser("test@test.com", "12345")
    }
}