package com.demo.hilt

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent

@InstallIn(ActivityComponent::class)
@Module
abstract class UserModule {

    /**
     * provides annotation with returning object manually
     */
    /*@Provides
    fun provideUserRepository() : UserRepository{
        return FirebaseRepository()
    }*/

    /**
     * Provides annotation with pass parameter return
     */
    /*@Provides
    fun provideUserRepository(sqlRepository: SQLRepository) : UserRepository{
        return sqlRepository
    }*/

    /**
     * Binds annotation with abstract method
     */
    @Binds
    abstract fun provideUserRepository(sqlRepository: SQLRepository) : UserRepository


}