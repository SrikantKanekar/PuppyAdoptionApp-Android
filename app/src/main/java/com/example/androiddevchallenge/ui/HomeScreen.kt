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

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.ui.components.SearchAppBar
import com.example.androiddevchallenge.ui.navigation.Screen.Detail

@Composable
fun HomeScreen(
    navController: NavHostController,
    viewModel: MyViewModel
) {

    Scaffold(
        topBar = {
            SearchAppBar(
                query = viewModel.query,
                onQueryChanged = viewModel::onQueryChanged,
                selectedCategory = viewModel.selectedCategory,
                onSelectedCategoryChanged = viewModel::selectedCategoryChange,
            )
        }
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 25.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(viewModel.puppies) { puppy ->
                PuppyCard(
                    puppy = puppy,
                    onClick = {
                        val route = Detail.route + "/${puppy.id}"
                        navController.navigate(route)
                    }
                )
            }
        }
    }
}

@Composable
fun PuppyCard(
    puppy: Puppy,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = MaterialTheme.shapes.large,
        elevation = 0.dp
    ) {
        Row(
            modifier = Modifier.padding(12.dp)
        ) {
            Image(
                painter = painterResource(id = puppy.imageId),
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .clip(shape = MaterialTheme.shapes.large),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(140.dp)
                    .padding(start = 16.dp, top = 8.dp)
            ) {
                Text(
                    text = puppy.name,
                    fontWeight = FontWeight.W500,
                    style = MaterialTheme.typography.h5
                )
                Text(
                    modifier = Modifier.padding(start = 1.dp),
                    text = puppy.breed,
                    style = MaterialTheme.typography.body2
                )
            }
            Distance(
                modifier = Modifier.align(Alignment.Bottom),
                distance = puppy.distance
            )
        }
    }
}
