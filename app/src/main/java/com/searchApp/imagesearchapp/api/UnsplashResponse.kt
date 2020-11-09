package com.searchApp.imagesearchapp.api

import com.searchApp.imagesearchapp.data.UnsplashPhoto

data class UnsplashResponse (
    val results: List<UnsplashPhoto>
)