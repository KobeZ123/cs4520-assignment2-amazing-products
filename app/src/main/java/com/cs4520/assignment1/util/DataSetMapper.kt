package com.cs4520.assignment1.util

import com.cs4520.assignment1.data.EquipmentProduct
import com.cs4520.assignment1.data.FoodProduct
import com.cs4520.assignment1.data.Product

/**
 * Maps the dataset to a list of [Product]
 */
fun List<List<Any?>>.mapToProductList(): List<Product> {
    return this.map{
        if (it.size == 4
            && it[0] is String
            && it[1] is String
            && it[2] is String?
            && it[3] is Int) {
            when (it[1]) {
                "Equipment" -> {
                    EquipmentProduct(
                        name = it[0] as String,
                        date = it[2] as String?,
                        price = it[3] as Int,
                        type = it[1] as String,
                    )

                }
                "Food" ->
                    FoodProduct(
                        name = it[0] as String,
                        date = it[2] as String?,
                        price = it[3] as Int,
                        type = it[1] as String,
                    )
                else ->
                    throw IllegalStateException("The dataset has unsupported product type!")
            }
        } else {
            throw IllegalStateException("The dataset is improperly formatted!")
        }
    }
}
