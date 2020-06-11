package com.nitro.hilttest

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

/**
 * Created by t.coulange on 11/06/2020.
 */
@Module(includes = [DebugStringModule::class])
@InstallIn(ActivityComponent::class)
object DebugModules