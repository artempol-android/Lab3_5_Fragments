package com.example.lab3_activity1

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lab3_activity1.databinding.FragmentMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class FragmentMain : Fragment(R.layout.fragment_main) {

    private lateinit var binding: FragmentMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentMainBinding.bind(view)

        binding.buttonMain.setOnClickListener { findNavController().navigate(R.id.action_fragmentMain_to_fragmentSecond) }

        val bottom: BottomNavigationView = binding.bottomNav
        bottom.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.item_about_activity)
                findNavController().navigate(R.id.graph_about_activity)
            return@setOnItemSelectedListener true
        }
    }

}