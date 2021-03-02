/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.ui.theme.montserratFamily

@Composable
fun MaleDescription(name: String, address: String) {
    Text(
        text = "$name is a super smart amazing dog with so much love to give. " +
            "He is well socialized with cats and dogs. He likes people and enjoys being cuddled. " +
            "He’d be very comfortable in a home with dogs or cats and lots of people. " +
            "He loves to play with toys, he is a great fetcher and will be the most loyal dog you will ever know. " +
            "He’s an easygoing and trusting little boy. He's healthy, vaccinated, and deWormed. " +
            "Available for adoption in $address." +
            "Give him a chance to be your forever best friend.",
        fontFamily = montserratFamily,
        fontWeight = FontWeight.Medium,
        fontStyle = FontStyle.Italic,
        fontSize = 14.sp
    )
}

@Composable
fun FemaleDescription(name: String, address: String) {
    Text(
        text = "$name is a super smart amazing dog with so much love to give. " +
            "She is well socialized with cats and dogs. She likes people and enjoys being cuddled. " +
            "She’d be very comfortable in a home with dogs or cats and lots of people. " +
            "She loves to play with toys, she is a great fetcher and will be the most loyal dog you will ever know. " +
            "She’s an easygoing and trusting little girl. She's healthy, vaccinated, and deWormed. " +
            "Available for adoption in $address." +
            "Give her a chance to be your forever best friend.",
        fontFamily = montserratFamily,
        fontWeight = FontWeight.Medium,
        fontStyle = FontStyle.Italic,
        fontSize = 14.sp
    )
}
