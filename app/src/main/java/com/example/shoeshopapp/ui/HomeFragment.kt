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


        binding.floatingActionButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_details)
        }
viewModel.getAllItems.observe(viewLifecycleOwner){
    binding.itemTitle.text = it.get(0).showName
    binding.itemTitle2.text = it.get(1).showName
    binding.itemTitle3.text = it.get(2).showName
    binding.itemTitle4.text = it.get(3).showName
    binding.itemTitle5.text = it.get(4).showName

    binding.itemSize.text = it.get(0).shoeSize
    binding.itemSize2.text = it.get(1).shoeSize
    binding.itemSize3.text = it.get(2).shoeSize
    binding.itemSize4.text = it.get(3).shoeSize
    binding.itemSize5.text = it.get(4).shoeSize

    binding.brandLogo.setImageResource(it.get(0).brandId)
    binding.brandLogo2.setImageResource(it.get(1).brandId)
    binding.brandLogo3.setImageResource(it.get(2).brandId)
    binding.brandLogo4.setImageResource(it.get(3).brandId)
    binding.brandLogo5.setImageResource(it.get(4).brandId)

    binding.products.setImageResource(it.get(0).imageId)
    binding.products2.setImageResource(it.get(1).imageId)
    binding.products3.setImageResource(it.get(2).imageId)
    binding.products4.setImageResource(it.get(3).imageId)
    binding.products5.setImageResource(it.get(4).imageId)



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