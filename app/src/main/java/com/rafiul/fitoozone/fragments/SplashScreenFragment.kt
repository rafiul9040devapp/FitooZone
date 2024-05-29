package com.rafiul.fitoozone.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.rafiul.fitoozone.R
import com.rafiul.fitoozone.databinding.FragmentSplashScreenBinding
import com.rafiul.fitoozone.utils.postDelayed


class SplashScreenFragment : Fragment(R.layout.fragment_splash_screen) {

    private lateinit var binding: FragmentSplashScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navigateToWelcomeScreen()
    }

    private fun navigateToWelcomeScreen() {
        Looper.getMainLooper().postDelayed() {
            findNavController().navigate(R.id.action_splashScreenFragment_to_welcomeScreenFragment)
        }
    }

}