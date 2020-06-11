package com.nitro.hilttest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nitro.hilttest.databinding.FragmentMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * Created by t.coulange on 11/06/2020.
 */
@AndroidEntryPoint
class TestFragment : AbstractFragment() {
    var binding: FragmentMainBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentMainBinding.inflate(inflater).also {
            binding = it
        }.root
    }

    @Inject
    lateinit var str: String
//    val viewModel: TestViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.textView?.text = str
    }
}