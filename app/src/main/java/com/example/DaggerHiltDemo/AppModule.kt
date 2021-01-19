package com.example.DaggerHiltDemo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    @Named("String1")
    fun provideTestString1() = "This is a test string number 1"

    @Singleton
    @Provides
    @Named("String2")
    fun provideTestString2() = "This is a test string number 2"
}