package com.example.shoeshopapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import com.example.shoeshopapp.R
import com.example.shoeshopapp.data.Account
import com.example.shoeshopapp.data.ShoesModel
import com.example.shoeshopapp.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
val viewModel: ItemsViewModel by viewModels()

    var account: List<Account> = listOf(
        Account(
            1,
            "email@email.com",
            "123"
        ))
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        if (account == account) {
            binding.loginBtn.setOnClickListener {
                viewModel.setQuery("login")
                findNavController().navigate(R.id.action_loginFragment_to_welcomScreenFragment)
            }
        }else {
            null
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}