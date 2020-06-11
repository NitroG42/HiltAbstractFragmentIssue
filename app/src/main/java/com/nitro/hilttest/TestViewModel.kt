package com.nitro.hilttest

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel

/**
 * Created by t.coulange on 11/06/2020.
 */
class TestViewModel @ViewModelInject constructor(val str: String) : ViewModel() {

}