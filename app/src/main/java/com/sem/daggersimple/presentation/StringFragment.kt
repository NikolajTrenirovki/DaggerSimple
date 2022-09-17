package com.sem.daggersimple.presentation

import android.content.Context
import android.os.Bundle
import android.util.Log
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
//import com.sem.daggersimple.presentation.di.appComponent
import androidx.fragment.app.viewModels
import com.sem.daggersimple.presentation.di.AppComponent

class StringFragment : Fragment() {

    private var binding : FragmentStringBinding? = null

/*    private val stringViewModel: StringViewModel by viewModels {

        getAppComponent().viewModelsFactory()
    }*/

     @Inject
     lateinit var stringViewModel: StringViewModel /*by viewModels<StringViewModel>()*/

   // val stringViewModel :StringViewModel by viewModels()

   // val stringViewModel by viewModels<StringViewModel>()

    override fun onAttach(context: Context) {
        super.onAttach(context)

      //  (activity as MainActivity).appComponent.inject(this)
        // Grabs the registrationComponent from the Activity and injects this Fragment
       // (activity as MainActivity).
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_string, container, false)

       // stringViewModel.getString.

       // Log.d("stringViewModel","stringViewModel = " + stringViewModel.getString)

      //  binding?.textView?.text = stringViewModel.getString



        return binding?.root
    }

}



