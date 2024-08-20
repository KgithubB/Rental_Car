package com.kousikbarik.rentalcar.data

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import com.kousikbarik.rentalcar.R
import com.kousikbarik.rentalcar.ui.theme.Primary
import com.kousikbarik.rentalcar.ui.theme.Secondary

data class Car(
    val name:String,
    @DrawableRes val image:Int,
    val color: Color,
    @DrawableRes val logo:Int,
    val recommendation:Int,
    val recommendationRate: Float,
    val price:Int,
    val rentalDays:Int,
    val recommenders:List<Int>,
    val bgColor:Color

    )
val luxuriousCars = listOf(

    Car(
        name = "Ferrari SF90 Stradale",
        image = R.drawable.ferrari_car,
        color = Color.Red,
        logo = R.drawable.ferrari_logo,
        recommendation = 97,
        recommendationRate = 4.8f,
        rentalDays = 7,
        price = 759,
        recommenders = listOf(
            R.drawable.user2, R.drawable.user4, R.drawable.user5
        ),
        bgColor = Primary
    ),
    Car(
        name = "Rolls-Royce Phantom",
        image = R.drawable.rolls_royce_car,
        color = Color.Black,
        logo = R.drawable.rolls_royce_logo,
        recommendation = 98,
        recommendationRate = 4.7f,
        rentalDays = 10,
        price = 799,
        recommenders = listOf(
            R.drawable.user1, R.drawable.user5, R.drawable.user3
        ),
        bgColor = Secondary
    ),
    Car(
        name = "Porsche 911 Turbo S",
        image = R.drawable.porsche_car,
        color = Color.Yellow,
        logo = R.drawable.porsche_logo,
        recommendation = 99,
        recommendationRate = 4.8f,
        rentalDays = 6,
        price = 689,
        recommenders = listOf(
            R.drawable.user3, R.drawable.user4, R.drawable.user1
        ),
        bgColor = Primary
    ),
    Car(
        name = "Lamborghini Aventador",
        image = R.drawable.lambarghini_car,
        color = Color.White,
        logo = R.drawable.lambarghini_logo,
        recommendation = 97,
        recommendationRate = 4.9f,
        rentalDays = 5,
        price = 649,
        recommenders = listOf(
            R.drawable.user4, R.drawable.user5, R.drawable.user2
        ),
        bgColor = Secondary
    )
)
