package com.example.countrypickerkotlin.util

<<<<<<< HEAD
<<<<<<< HEAD
import android.content.Context
import android.widget.ImageView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.countrypickerkotlin.R

//Extension

fun ImageView.downloadFromUrl(url: String?, progressDrawable: CircularProgressDrawable) {

    val options = RequestOptions()
        .placeholder(progressDrawable)
        .error(R.mipmap.ic_launcher_round)

    Glide.with(context)
        .setDefaultRequestOptions(options)
        .load(url)
        .into(this)
}

fun placeHolderProgressBar(context: Context) : CircularProgressDrawable {
    return CircularProgressDrawable(context).apply {
        strokeWidth = 8f
        centerRadius = 40f
        start()
    }
}
=======
>>>>>>> e02edee9194445f72a80a5a6764f17bb88a0997d
=======
>>>>>>> e02edee9194445f72a80a5a6764f17bb88a0997d
