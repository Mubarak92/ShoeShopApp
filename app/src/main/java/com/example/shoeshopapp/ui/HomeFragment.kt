package com.example.shoeshopapp.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.shoeshopapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding :FragmentHomeBinding? = null
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
        _binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

viewModel.getAllItems.observe(viewLifecycleOwner){
    binding.itemTitle.text = it.get(0).nameId.toString()
    Log.e("TAG", "onViewCreated: ${it.get(0).nameId.toString()}", )

}




//        binding.recyclerview.apply {
//            adapter = ItemsAdapter(
//                context = requireContext()
//
//            )
//        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}