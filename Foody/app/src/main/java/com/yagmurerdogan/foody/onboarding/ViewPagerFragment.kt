package com.yagmurerdogan.foody.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yagmurerdogan.foody.R
import com.yagmurerdogan.foody.databinding.FragmentViewPagerBinding
import com.yagmurerdogan.foody.onboarding.screens.FirstScreen
import com.yagmurerdogan.foody.onboarding.screens.SecondScreen
import com.yagmurerdogan.foody.onboarding.screens.ThirdScreen

class ViewPagerFragment : Fragment() {

    private lateinit var binding: FragmentViewPagerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentViewPagerBinding.inflate(inflater, container, false)

        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewPager.adapter = adapter


        return binding.root
    }

}