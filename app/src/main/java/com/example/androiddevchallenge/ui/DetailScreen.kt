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
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Palette
import androidx.compose.material.icons.filled.Pets
import androidx.compose.material.icons.filled.Wc
import androidx.compose.material.icons.outlined.NearMe
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Gender.MALE
import com.example.androiddevchallenge.data.PuppyDataProvider
import com.example.androiddevchallenge.ui.components.FemaleDescription
import com.example.androiddevchallenge.ui.components.MaleDescription
import com.example.androiddevchallenge.ui.theme.primaryLight

@Composable
fun DetailScreen(
    puppyId: Int
) {
    val puppy = PuppyDataProvider.puppies[puppyId - 1]

    Scaffold {

        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {
            Image(
                painter = painterResource(id = puppy.imageId),
                contentDescription = null,
                modifier = Modifier
                    .height(300.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .padding(top = 20.dp)
            ) {

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(70.dp)
                ) {

                    Text(
                        text = puppy.name,
                        fontWeight = FontWeight.W500,
                        style = MaterialTheme.typography.h4
                    )

                    Text(
                        modifier = Modifier.align(Alignment.BottomStart).padding(start = 2.dp),
                        text = puppy.breed,
                        style = MaterialTheme.typography.body1
                    )

                    Button(
                        modifier = Modifier.align(Alignment.TopEnd).padding(top = 8.dp, end = 4.dp),
                        onClick = {},
                        elevation = ButtonDefaults.elevation(defaultElevation = 0.dp),
                        shape = RoundedCornerShape(percent = 50),
                        colors = ButtonDefaults.buttonColors(backgroundColor = primaryLight)
                    ) {
                        Text(
                            text = "Adopt",
                            style = MaterialTheme.typography.button
                        )
                    }

                    Distance(
                        modifier = Modifier.align(Alignment.BottomEnd).padding(end = 10.dp),
                        distance = puppy.distance
                    )
                }

                Divider(Modifier.padding(vertical = 16.dp, horizontal = 8.dp))

                PuppyData(age = puppy.age, gender = puppy.gender, color = puppy.color)

                Spacer(modifier = Modifier.height(16.dp))

                if (puppy.gender == MALE) {
                    MaleDescription(name = puppy.name, address = puppy.address)
                } else {
                    FemaleDescription(name = puppy.name, address = puppy.address)
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .padding(bottom = 16.dp),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(text = "~ ${puppy.time}", style = MaterialTheme.typography.caption)
                }
            }
        }
    }
}

@Composable
fun PuppyData(age: String, gender: String, color: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            Icon(imageVector = Icons.Default.Pets, contentDescription = null)
            Text(
                text = age,
                style = MaterialTheme.typography.overline,
                overflow = TextOverflow.Ellipsis
            )
        }

        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            Icon(imageVector = Icons.Default.Wc, contentDescription = null)
            Text(
                text = gender,
                style = MaterialTheme.typography.overline,
                overflow = TextOverflow.Ellipsis
            )
        }

        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            Icon(imageVector = Icons.Default.Palette, contentDescription = null)
            Text(
                text = color,
                style = MaterialTheme.typography.overline,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Composable
fun Distance(
    modifier: Modifier = Modifier,
    distance: String
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(5.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Outlined.NearMe,
            contentDescription = null,
            modifier = Modifier.size(16.dp),
            tint = MaterialTheme.colors.primary
        )
        Text(
            text = distance,
            style = MaterialTheme.typography.caption,
            color = MaterialTheme.colors.primary
        )
    }
}
