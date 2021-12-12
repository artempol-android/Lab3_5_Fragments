package com.example.lab3_activity1

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lab3_activity1.databinding.FragmentThirdBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class FragmentThird : Fragment(R.layout.fragment_third) {

    private lateinit var binding: FragmentThirdBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentThirdBinding.bind(view)

        binding.bnToFirst.setOnClickListener { findNavController().popBackStack(R.id.fragmentMain, false) }

        binding.bnToSecond.setOnClickListener { findNavController().popBackStack() }

    }

}