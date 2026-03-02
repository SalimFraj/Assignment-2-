package com.example.artspaceapp.data

import com.example.artspaceapp.R

data class ArtWork(
    val imageRes: Int,
    val title: String,
    val artist: String,
    val year: String
)

val artworks = listOf(
    ArtWork(
        imageRes = R.drawable.art1,
        title = "A/B",
        artist = "Kaleo",
        year = "2016"
    ),
    ArtWork(
        imageRes = R.drawable.art2,
        title = "Surface Sounds",
        artist = "Kaleo",
        year = "2021"
    ),
    ArtWork(
        imageRes = R.drawable.art4,
        title = "MIXED EMOTIONS",
        artist = "Kaleo",
        year = "2025"
    )
)
