package com.example.countrypickerkotlin.viewmodel

<<<<<<< HEAD
<<<<<<< HEAD
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

//Use Application Context instead of fragment or activity context.
abstract class BaseViewModel(application: Application) : AndroidViewModel(application), CoroutineScope {

    private val job = Job()

    override val coroutineContext: CoroutineContext
        get() = job + Dispatchers.Main //Do job and return main thread


    override fun onCleared() {
        super.onCleared()
        job.cancel()
    }

=======
class BaseViewModel {
>>>>>>> e02edee9194445f72a80a5a6764f17bb88a0997d
=======
class BaseViewModel {
>>>>>>> e02edee9194445f72a80a5a6764f17bb88a0997d
}