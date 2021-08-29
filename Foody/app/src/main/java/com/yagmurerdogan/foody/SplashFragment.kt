package com.yagmurerdogan.foody

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.yagmurerdogan.foody.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {

    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        Handler().postDelayed({
            findNavController().navigate(R.id.action_splashFragment_to_viewPagerFragment)
        },3000)

        binding = FragmentSplashBinding.inflate(layoutInflater,container,false)

        return binding.root
    }
}