package com.harunbekcan.common

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide


fun View.setVisible() {
    visibility = View.VISIBLE
}

fun View.setGone() {
    visibility = View.GONE
}

fun ImageView.loadImage(imageUrl: String?) {
    Glide.with(this.context)
        .load(imageUrl)
        .into(this)
}