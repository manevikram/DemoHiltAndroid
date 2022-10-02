package com.demo.hilt

import android.util.Log
import javax.inject.Inject

const val TAG = "VIKRAM"

interface UserRepository{
    fun saveUser(email : String, pwd: String)
}

class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser(email : String, pwd: String){
        Log.d(TAG, "User Saved in DB")
        //Log.d(TAG, "saveUser: User Saved in DB")
    }
}

class FirebaseRepository() : UserRepository{
    override fun saveUser(email: String, pwd: String) {
        Log.d(TAG, "saveUser: User saved in firebase")
    }
}