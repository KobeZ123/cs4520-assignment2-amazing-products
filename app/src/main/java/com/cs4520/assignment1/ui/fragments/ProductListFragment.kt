package com.cs4520.assignment1.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cs4520.assignment1.ui.adapters.ProductCardAdapter
import com.cs4520.assignment1.R
import com.cs4520.assignment1.productsDataset
import com.cs4520.assignment1.util.mapToProductList

/**
 * This ProductListFragment holds a RecyclerView to display a list of products.
 */
class ProductListFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_product_list, container, false)

        val productList = productsDataset.mapToProductList()
        val productCardAdapter = ProductCardAdapter(productList)
        val recyclerView: RecyclerView = rootView.findViewById(R.id.product_list_view)
        recyclerView.adapter = productCardAdapter
        recyclerView.layoutManager = LinearLayoutManager(this.context)

        return rootView
    }
}