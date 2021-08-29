package com.yagmurerdogan.foody.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yagmurerdogan.foody.R
import com.yagmurerdogan.foody.databinding.FragmentSecondScreenBinding

class SecondScreen : Fragment() {

    private lateinit var binding: FragmentSecondScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentSecondScreenBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

}