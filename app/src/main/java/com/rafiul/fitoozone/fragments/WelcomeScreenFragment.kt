package com.rafiul.fitoozone.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rafiul.fitoozone.R
import com.rafiul.fitoozone.databinding.FragmentWelcomeScreenBinding


class WelcomeScreenFragment : Fragment(R.layout.fragment_welcome_screen) {

    private lateinit var binding: FragmentWelcomeScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWelcomeScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

}