package com.demo.hilt

import javax.inject.Inject

const val TAG = "VIKRAM"

class UserRepository @Inject constructor(var loggerService: LoggerService) {
    fun saveUser(email : String, pwd: String){
        loggerService.log("aveUser: User Saved in DB")
        //Log.d(TAG, "saveUser: User Saved in DB")
    }
}