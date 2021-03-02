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
package com.example.androiddevchallenge.data

data class Puppy(
    val id: Int,
    val name: String,
    val breed: String,
    val imageId: Int,
    val color: String,
    val age: String,
    val gender: String,
    val address: String,
    val distance: String,
    val status: String,
    val time: String
)

object Breed {
    const val ALL = "ALL"
    const val PUG = "Pug"
    const val BEAGLE = "Beagle"
    const val SAMOYED = "Samoyed"
    const val SHAR_PEI = "Shar Pei"
    const val JACK_RUSSELL_TERRIER = "Jack Russell Terrier"
    const val POMERANIAN = "Pomeranian"
    const val GOLDEN_RETRIEVER = "Golden Retriever"
    const val DACHSHUND = "Dachshund"
    const val SAINT_BERNARD = "Saint Bernard"
    const val DALMATIAN = "Dalmatian"

    fun categories(): MutableList<String> {
        return mutableListOf(
            ALL,
            PUG,
            BEAGLE,
            SAMOYED,
            SHAR_PEI,
            JACK_RUSSELL_TERRIER,
            POMERANIAN,
            GOLDEN_RETRIEVER,
            DACHSHUND,
            SAINT_BERNARD,
            DALMATIAN
        )
    }
}

object Gender {
    const val MALE = "MALE"
    const val FEMALE = "FEMALE"
}

object Status {
    const val AVAILABLE = "AVAILABLE"
    const val ADOPTED = "ADOPTED"
}
