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
package com.example.androiddevchallenge.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.data.Breed
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.data.PuppyDataProvider

class MyViewModel : ViewModel() {

    var query by mutableStateOf("Search")

    fun onQueryChanged(value: String) {
        query = value
    }

    var puppies by mutableStateOf<List<Puppy>>(PuppyDataProvider.puppies)

    var selectedCategory by mutableStateOf(Breed.ALL)

    fun selectedCategoryChange(category: String) {
        selectedCategory = category
        puppies = if (selectedCategory == Breed.ALL) {
            PuppyDataProvider.puppies
        } else {
            val newPuppyList: ArrayList<Puppy> = ArrayList()
            for (puppy in PuppyDataProvider.puppies) {
                if (puppy.breed == selectedCategory) {
                    newPuppyList.add(puppy)
                }
            }
            newPuppyList
        }
    }
}
