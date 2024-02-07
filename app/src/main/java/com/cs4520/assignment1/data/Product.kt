package com.cs4520.assignment1.data

/**
 * This interface represents a Product
 * @property name product name
 * @property date product date
 * @property price product price
 * @property type product type
 */
sealed interface Product {
    val name: String
    val date: String?
    val price: Int
    val type: String
}

/**
 * This interface represents a Food product
 * @property name food name
 * @property date food date
 * @property price food price
 * @property type food type
 */
class FoodProduct(
    override val name: String,
    override val date: String?,
    override val price: Int,
    override val type: String = "Food"
): Product

/**
 * This interface represents a Equipment product
 * @property name equipment name
 * @property date equipment date
 * @property price equipment price
 * @property type equipment type
 */
class EquipmentProduct(
    override val name: String,
    override val date: String?,
    override val price: Int,
    override val type: String = "Equipment"
): Product
