package com.example.countrypickerkotlin.service

<<<<<<< HEAD
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.countrypickerkotlin.model.Country

@Dao
interface CountryDao {

    //Data Access Object

     @Insert
     suspend fun insertAll(vararg countries: Country) : List<Long>

    //suspend : coroutine, pause and resume functions
    //Insert : INSERT INTO
    //vararg : multiple country objects
    //List<Long> : returns primary keys


     @Query("SELECT * FROM country")
     suspend fun getAllCountries() : List<Country>

    @Query("SELECT * FROM country WHERE uuid = :countryId")
    suspend fun getCountry(countryId : Int) : Country

    @Query("DELETE FROM country")
    suspend fun deleteAllCountries()
=======
interface CountryDAO {
>>>>>>> e02edee9194445f72a80a5a6764f17bb88a0997d
}