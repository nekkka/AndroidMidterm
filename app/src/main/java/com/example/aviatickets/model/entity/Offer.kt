/*package com.example.aviatickets.model.entity

import com.google.gson.annotations.SerializedName

data class Offer(
    @SerializedName("id") val id: String,
    @SerializedName("price") val price: Int,
    @SerializedName("flight") val flight: Flight,
)*/

package com.example.aviatickets.model.entity

data class Offer(
    val id: String,
    val price: Int,
    val flight: Flight
)