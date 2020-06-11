package com.nitro.hilttest

import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck

/**
 * Created by t.coulange on 11/06/2020.
 */
@Module
@DisableInstallInCheck
object DebugStringModule {
    @Provides
    fun maString() = "Debug"
}