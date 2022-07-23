package com.example.shoeshopapp.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.shoeshopapp.R
import com.example.shoeshopapp.databinding.FragmentDetailsBinding
import com.example.shoeshopapp.databinding.FragmentWelcomScreenBinding

class WelcomScreenFragment : Fragment() {
    private var _binding: FragmentWelcomScreenBinding? = null
    private val binding get() = _binding!!
    val viewModel: ItemsViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWelcomScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.e("State", "onViewCreated: ${viewModel.filteredData.value?.toList().toString()}", )

        binding.buttonGetStarted.setOnClickListener {
            findNavController().navigate(R.id.action_welcomScreenFragment_to_homeFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}