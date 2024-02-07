package com.cs4520.assignment1.ui.adapters

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.cs4520.assignment1.R
import com.cs4520.assignment1.data.EquipmentProduct
import com.cs4520.assignment1.data.FoodProduct
import com.cs4520.assignment1.data.Product

class ProductCardAdapter(
    private val dataSet: List<Product>
) : RecyclerView.Adapter<ProductCardAdapter.ViewHolder>() {
    /**
     * reference to view holder
     */
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardContainer = itemView.findViewById<ConstraintLayout>(R.id.product_card_container)
        val imageView = itemView.findViewById<ImageView>(R.id.product_image)
        val nameText = itemView.findViewById<TextView>(R.id.product_name_text)
        val priceText = itemView.findViewById<TextView>(R.id.product_price_text)
        val dateText = itemView.findViewById<TextView>(R.id.product_date_text)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_product_card, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = dataSet.size

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val product: Product = dataSet[position]
        viewHolder.nameText.text = product.name
        viewHolder.priceText.text = product.price.toString()
        product.date?.let {
            viewHolder.dateText.text = it
        }
        when (product) {
            is EquipmentProduct -> {
                viewHolder.cardContainer.setBackgroundColor(Color.parseColor("#E06666"))
                viewHolder.imageView.setImageResource(R.drawable.equipment)
            }
            is FoodProduct -> {
                viewHolder.cardContainer.setBackgroundColor(Color.parseColor("#FFD965"))
                viewHolder.imageView.setImageResource(R.drawable.food)
            }
        }
    }
}