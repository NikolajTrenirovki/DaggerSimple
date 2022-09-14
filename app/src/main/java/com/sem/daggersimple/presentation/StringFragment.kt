package com.sem.daggersimple.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import com.sem.daggersimple.R
import com.sem.daggersimple.data.StringRepository
import com.sem.daggersimple.databinding.FragmentStringBinding
import javax.inject.Inject
import androidx.lifecycle.Observer

class StringFragment : Fragment() {

    private var binding : FragmentStringBinding? = null

    @Inject
    lateinit var stringViewModel: StringViewModel



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_string, container, false)
        // Inflate the layout for this fragment

        StringRepository("test")

        binding?.textView?.text = stringViewModel.getString

        return binding?.root
    }

}