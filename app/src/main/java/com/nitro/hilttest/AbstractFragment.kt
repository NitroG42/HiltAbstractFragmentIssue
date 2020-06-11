package com.nitro.hilttest

import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

/**
 * Created by t.coulange on 11/06/2020.
 */
abstract class AbstractFragment(@LayoutRes layoutId: Int = 0) : Fragment(layoutId)