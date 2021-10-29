package com.example.lab3_activity1

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lab3_activity1.databinding.FragmentSecondBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class FragmentSecond : Fragment(R.layout.fragment_second) {

    private lateinit var binding: FragmentSecondBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentSecondBinding.bind(view)

        binding.toFirstButton.setOnClickListener { findNavController().popBackStack() }

        binding.toThirdButton.setOnClickListener { findNavController().navigate(R.id.action_fragmentSecond_to_fragmentThird) }

        val bottom: BottomNavigationView = binding.bottomNav
        bottom.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.item_about_activity)
                findNavController().navigate(R.id.graph_about_activity)
            return@setOnItemSelectedListener true
        }
    }


}