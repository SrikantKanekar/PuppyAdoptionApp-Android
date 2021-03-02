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

import com.example.androiddevchallenge.R

object PuppyDataProvider {

    val puppy = Puppy(
        id = 0,
        name = "Jack",
        imageId = R.drawable.pug1,
        breed = Breed.PUG,
        color = "brown",
        age = "4 months",
        gender = Gender.MALE,
        address = "Texas",
        distance = "19 km",
        status = Status.AVAILABLE,
        time = "4 hours ago"
    )

    val puppies = mutableListOf(
        Puppy(
            id = 1,
            name = "Chico",
            imageId = R.drawable.samoyed2,
            breed = Breed.SAMOYED,
            color = "Yellow",
            age = "1 year",
            gender = Gender.MALE,
            address = "Texas",
            distance = "53 km",
            status = Status.AVAILABLE,
            time = "3 days ago"
        ),
        Puppy(
            id = 2,
            name = "Coco",
            imageId = R.drawable.golden_retriever1,
            breed = Breed.GOLDEN_RETRIEVER,
            color = "brown",
            age = "1 year 9 months",
            gender = Gender.MALE,
            address = "California",
            distance = "84 km",
            status = Status.AVAILABLE,
            time = "1 day ago"
        ),
        Puppy(
            id = 3,
            name = "Tyson",
            imageId = R.drawable.dachshund2,
            breed = Breed.DACHSHUND,
            color = "Yellow",
            age = "1 year",
            gender = Gender.MALE,
            address = "Florida",
            distance = "65 km",
            status = Status.AVAILABLE,
            time = "3 days ago"
        ),
        Puppy(
            id = 4,
            name = "Bella",
            imageId = R.drawable.pomeranian1,
            breed = Breed.POMERANIAN,
            color = "white",
            age = "1 month",
            gender = Gender.FEMALE,
            address = "Texas",
            distance = "18 km",
            status = Status.AVAILABLE,
            time = "23 hours ago"
        ),
        Puppy(
            id = 5,
            name = "Jake",
            imageId = R.drawable.jack_russell_terrier1,
            breed = Breed.JACK_RUSSELL_TERRIER,
            color = "white",
            age = "1 year",
            gender = Gender.MALE,
            address = "Florida",
            distance = "25 km",
            status = Status.ADOPTED,
            time = "11 hours ago"
        ),
        Puppy(
            id = 6,
            name = "Lucy",
            imageId = R.drawable.beagle1,
            breed = Breed.BEAGLE,
            color = "white",
            age = "1 year",
            gender = Gender.FEMALE,
            address = "Florida",
            distance = "74 km",
            status = Status.AVAILABLE,
            time = "1 day ago"
        ),
        Puppy(
            id = 7,
            name = "Daisy",
            imageId = R.drawable.dachshund1,
            breed = Breed.DACHSHUND,
            color = "brown",
            age = "8 months",
            gender = Gender.FEMALE,
            address = "New York",
            distance = "37 km",
            status = Status.ADOPTED,
            time = "1 day ago"
        ),
        Puppy(
            id = 8,
            name = "Mac",
            imageId = R.drawable.saint_bernard1,
            breed = Breed.SAINT_BERNARD,
            color = "white",
            age = "7 months",
            gender = Gender.MALE,
            address = "California",
            distance = "22 km",
            status = Status.AVAILABLE,
            time = "1 day ago"
        ),
        Puppy(
            id = 9,
            name = "Molly",
            imageId = R.drawable.samoyed1,
            breed = Breed.SAMOYED,
            color = "white",
            age = "1 year",
            gender = Gender.FEMALE,
            address = "New York",
            distance = "75 km",
            status = Status.AVAILABLE,
            time = "1 day ago"
        ),
        Puppy(
            id = 10,
            name = "Loki",
            imageId = R.drawable.dalmatian1,
            breed = Breed.DALMATIAN,
            color = "white",
            age = "1 year",
            gender = Gender.MALE,
            address = "Texas",
            distance = "9 km",
            status = Status.ADOPTED,
            time = "2 days ago"
        ),
        Puppy(
            id = 11,
            name = "Kobe",
            imageId = R.drawable.pug2,
            breed = Breed.PUG,
            color = "white",
            age = "8 months",
            gender = Gender.MALE,
            address = "California",
            distance = "14 km",
            status = Status.ADOPTED,
            time = "2 days ago"
        ),
        Puppy(
            id = 12,
            name = "Jasper",
            imageId = R.drawable.jack_russell_terrier2,
            breed = Breed.JACK_RUSSELL_TERRIER,
            color = "brown",
            age = "5 months",
            gender = Gender.MALE,
            address = "Florida",
            distance = "96 km",
            status = Status.AVAILABLE,
            time = "2 days ago"
        ),
        Puppy(
            id = 13,
            name = "Hank",
            imageId = R.drawable.shar_pei2,
            breed = Breed.SHAR_PEI,
            color = "brown",
            age = "2 years",
            gender = Gender.MALE,
            address = "New York",
            distance = "47 km",
            status = Status.ADOPTED,
            time = "2 days ago"
        ),
        Puppy(
            id = 14,
            name = "Benny",
            imageId = R.drawable.pomeranian2,
            breed = Breed.POMERANIAN,
            color = "Yellow",
            age = "1 year",
            gender = Gender.MALE,
            address = "Texas",
            distance = "67 km",
            status = Status.AVAILABLE,
            time = "2 days ago"
        ),
        Puppy(
            id = 15,
            name = "Baxter",
            imageId = R.drawable.pug1,
            breed = Breed.PUG,
            color = "brown",
            age = "4 months",
            gender = Gender.MALE,
            address = "California",
            distance = "19 km",
            status = Status.AVAILABLE,
            time = "9 hours ago"
        ),
        Puppy(
            id = 16,
            name = "Ace",
            imageId = R.drawable.beagle2,
            breed = Breed.BEAGLE,
            color = "Yellow",
            age = "1 year",
            gender = Gender.MALE,
            address = "New York",
            distance = "81 km",
            status = Status.AVAILABLE,
            time = "3 days ago"
        ),
        Puppy(
            id = 17,
            name = "Jax",
            imageId = R.drawable.shar_pei1,
            breed = Breed.SHAR_PEI,
            color = "brown",
            age = "9 months",
            gender = Gender.MALE,
            address = "New York",
            distance = "94 km",
            status = Status.AVAILABLE,
            time = "15 hours ago"
        ),
        Puppy(
            id = 18,
            name = "Ziggy",
            imageId = R.drawable.saint_bernard2,
            breed = Breed.SAINT_BERNARD,
            color = "Yellow",
            age = "1 year",
            gender = Gender.MALE,
            address = "California",
            distance = "41 km",
            status = Status.ADOPTED,
            time = "3 days ago"
        ),
        Puppy(
            id = 19,
            name = "Chase",
            imageId = R.drawable.golden_retriever2,
            breed = Breed.GOLDEN_RETRIEVER,
            color = "Yellow",
            age = "1 year",
            gender = Gender.MALE,
            address = "California",
            distance = "73 km",
            status = Status.AVAILABLE,
            time = "2 days ago"
        ),
        Puppy(
            id = 20,
            name = "Louie",
            imageId = R.drawable.dalmatian2,
            breed = Breed.DALMATIAN,
            color = "Yellow",
            age = "1 year",
            gender = Gender.MALE,
            address = "New York",
            distance = "13 km",
            status = Status.AVAILABLE,
            time = "3 days ago"
        ),
        Puppy(
            id = 21,
            name = "Oreo",
            imageId = R.drawable.pug3,
            breed = Breed.PUG,
            color = "Yellow",
            age = "1 year",
            gender = Gender.MALE,
            address = "California",
            distance = "34 km",
            status = Status.ADOPTED,
            time = "4 days ago"
        ),
        Puppy(
            id = 22,
            name = "Emma",
            imageId = R.drawable.jack_russell_terrier3,
            breed = Breed.JACK_RUSSELL_TERRIER,
            color = "Yellow",
            age = "1 year",
            gender = Gender.FEMALE,
            address = "Florida",
            distance = "64 km",
            status = Status.AVAILABLE,
            time = "4 days ago"
        ),
        Puppy(
            id = 23,
            name = "Leo",
            imageId = R.drawable.shar_pei3,
            breed = Breed.SHAR_PEI,
            color = "Yellow",
            age = "1 year",
            gender = Gender.MALE,
            address = "New York",
            distance = "72 km",
            status = Status.ADOPTED,
            time = "4 days ago"
        ),
        Puppy(
            id = 24,
            name = "Lilly",
            imageId = R.drawable.pomeranian3,
            breed = Breed.POMERANIAN,
            color = "Yellow",
            age = "1 year",
            gender = Gender.FEMALE,
            address = "California",
            distance = "7 km",
            status = Status.AVAILABLE,
            time = "4 days ago"
        ),
        Puppy(
            id = 25,
            name = "Sparky",
            imageId = R.drawable.golden_retriever3,
            breed = Breed.GOLDEN_RETRIEVER,
            color = "Yellow",
            age = "1 year",
            gender = Gender.MALE,
            address = "New York",
            distance = "15 km",
            status = Status.AVAILABLE,
            time = "5 days ago"
        ),
        Puppy(
            id = 26,
            name = "Murphy",
            imageId = R.drawable.beagle3,
            breed = Breed.BEAGLE,
            color = "Yellow",
            age = "1 year",
            gender = Gender.MALE,
            address = "Florida",
            distance = "25 km",
            status = Status.ADOPTED,
            time = "5 days ago"
        ),
        Puppy(
            id = 27,
            name = "Millie",
            imageId = R.drawable.dachshund3,
            breed = Breed.DACHSHUND,
            color = "Yellow",
            age = "1 year",
            gender = Gender.FEMALE,
            address = "Texas",
            distance = "8 km",
            status = Status.AVAILABLE,
            time = "6 days ago"
        ),
        Puppy(
            id = 28,
            name = "Sadie",
            imageId = R.drawable.saint_bernard3,
            breed = Breed.SAINT_BERNARD,
            color = "Yellow",
            age = "1 year",
            gender = Gender.FEMALE,
            address = "New York",
            distance = "5 km",
            status = Status.AVAILABLE,
            time = "1 week ago"
        ),
        Puppy(
            id = 29,
            name = "Cody",
            imageId = R.drawable.samoyed3,
            breed = Breed.SAMOYED,
            color = "Yellow",
            age = "1 year",
            gender = Gender.MALE,
            address = "Texas",
            distance = "35 km",
            status = Status.AVAILABLE,
            time = "1 week ago"
        ),
        Puppy(
            id = 30,
            name = "Bailey",
            imageId = R.drawable.dalmatian3,
            breed = Breed.DALMATIAN,
            color = "Yellow",
            age = "1 year",
            gender = Gender.FEMALE,
            address = "Florida",
            distance = "43 km",
            status = Status.ADOPTED,
            time = "1 week ago"
        ),
        Puppy(
            id = 31,
            name = "Kobe",
            imageId = R.drawable.pug2,
            breed = Breed.PUG,
            color = "white",
            age = "8 months",
            gender = Gender.MALE,
            address = "California",
            distance = "14 km",
            status = Status.ADOPTED,
            time = "2 days ago"
        ),
    )
}
