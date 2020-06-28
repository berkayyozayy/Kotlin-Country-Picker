package com.example.countrypickerkotlin.service

<<<<<<< HEAD
import com.example.countrypickerkotlin.model.Country
import io.reactivex.Single
import retrofit2.http.GET

interface CountryAPI {

    //https://raw.githubusercontent.com/atilsamancioglu/IA19-DataSetCountries/master/countrydataset.json
    //BASE_URL -> https://raw.githubusercontent.com/
    // EXTENSION -> atilsamancioglu/IA19-DataSetCountries/master/countrydataset.json

    @GET("atilsamancioglu/IA19-DataSetCountries/master/countrydataset.json")
    fun getCountries(): Single<List<Country>>

=======
interface CountryAPI {
>>>>>>> e02edee9194445f72a80a5a6764f17bb88a0997d
}