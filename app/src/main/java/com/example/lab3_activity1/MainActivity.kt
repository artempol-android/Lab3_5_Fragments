package com.example.lab3_activity1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.*
import com.example.lab3_activity1.databinding.FragmentHostBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: FragmentHostBinding
    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FragmentHostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = findNavController(R.id.fragment_container_view)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        val bottom: BottomNavigationView = binding.bottomNav
        bottom.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.item_about_activity)
                startActivity(Intent(this, ActivityAbout::class.java))
            return@setOnItemSelectedListener true
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

}