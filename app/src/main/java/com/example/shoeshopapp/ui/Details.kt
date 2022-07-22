package com.example.shoeshopapp.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.shoeshopapp.databinding.FragmentDetailsBinding
import com.example.shoeshopapp.databinding.FragmentHomeBinding
import kotlinx.coroutines.flow.collect


class Details : Fragment() {
        private var _binding: FragmentDetailsBinding? = null
        private val binding get() = _binding!!


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
            arguments?.let {
                binding.textView.text = it.getString("brandName").toString()
                binding.textView2.text = it.getString("brandDiscript").toString()
                binding.imageView.setImageResource(it.getInt("brandImage"))
            }
        }

        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }

    }