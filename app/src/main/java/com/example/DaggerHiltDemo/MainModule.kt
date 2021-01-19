package com.example.DaggerHiltDemo

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
object MainModule {

    @ActivityScoped
    @Provides
    @Named("StringFromMainModule")
    fun provideTestString1(
        @ActivityContext context: Context,
        @Named("String1")
        string: String
    ) = context.getString(R.string.temp_String)+ ", "+string
}