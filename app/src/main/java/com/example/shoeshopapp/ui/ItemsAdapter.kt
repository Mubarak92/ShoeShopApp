package com.example.shoeshopapp.ui
//
//import android.content.Context
//import android.util.Log
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.*
//import androidx.constraintlayout.widget.ConstraintLayout
//import androidx.navigation.NavController
//import androidx.navigation.findNavController
//import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
//import androidx.navigation.fragment.findNavController
//import androidx.recyclerview.widget.RecyclerView
//import com.example.shoeshopapp.R
//import com.example.shoeshopapp.data.DataClass
//import com.example.shoeshopapp.data.DataSource
//import com.google.android.material.textview.MaterialTextView
//
//
//class ItemsAdapter(
//    private val context: Context,
//) : RecyclerView.Adapter<ItemsAdapter.ItemViewHolder>() {
//    private val dataset = DataSource().loadData()
//
//    class ItemViewHolder(val binding: View) : RecyclerView.ViewHolder(binding) {
//
//        val name = binding.findViewById<MaterialTextView>(R.id.item_title)
//        val description =
//            binding.findViewById<MaterialTextView>(R.id.item_description)
//        val image: ImageView? = binding.findViewById(R.id.imageView)
//        val brand: ImageView? = binding.findViewById(R.id.brand_logo)
//        val button: Button = binding.findViewById(R.id.button)
//
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
//        val adapterLayout = LayoutInflater.from(parent.context)
//            .inflate(R.layout.item_list, parent, false)
//
//        return ItemViewHolder(adapterLayout)
//    }
//
//    override fun onBindViewHolder(
//        viewHolder: ItemViewHolder, position: Int
//    ) {
//
//        val item = dataset[position]
//        viewHolder.name.text = context.resources.getString(item.nameId)
//        viewHolder.description.text = context.resources.getString(item.descriptionId)
//        viewHolder.brand?.setImageResource(item.brandId)
//        viewHolder.image?.setImageResource(item.imageId)
//        viewHolder.button.setOnClickListener {
//            val action = HomeFragmentDirections.actionHomeFragmentToDetails(
//                brandName = context.resources.getString(item.imageId),
//                brandImage = item.imageId,
//                brandDiscript = context.resources.getString(item.descriptionId)
//            )
//            viewHolder.itemView.findNavController().navigate(action)
//        }
//    }
//
//
//    override fun getItemCount(): Int {
//        return dataset.size
//    }
//
//}
//
//
//
//
//
//
//
//
//
//
