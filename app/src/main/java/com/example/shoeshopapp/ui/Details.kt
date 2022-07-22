package com.example.shoeshopapp.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.shoeshopapp.R
import com.example.shoeshopapp.databinding.FragmentDetailsBinding
import com.example.shoeshopapp.databinding.FragmentHomeBinding
import kotlinx.coroutines.flow.collect


class Details : Fragment() {
    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!
    private val viewModel: ItemsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setHasOptionsMenu(false)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.saveShoe.setOnClickListener {
            viewModel.addNewItem(10, "Test", "100", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA")
            findNavController().navigate(R.id.action_details_to_homeFragment)
        }

        binding.cancelBtn.setOnClickListener {
            findNavController().navigate(R.id.action_details_to_homeFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}