package com.example.a10122914latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

/*
28 April 2023, 10122914, Dwi Nurcahyo, AKB IF-10
 */

class Biodata : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)
    }
    fun Selanjutnya(view: View?) {
        val intent = Intent(this@Biodata, Selesai::class.java)
        startActivity(intent)
    }
}