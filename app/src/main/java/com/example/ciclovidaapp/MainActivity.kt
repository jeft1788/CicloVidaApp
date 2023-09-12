package com.example.ciclovidaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private  var LOG_TAG: String = MainActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(LOG_TAG, "onCreate llamado")
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "onStart llamado")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "onResume llamado")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "onPause llamado")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "onStop llamado")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_TAG, "onRestart llamado")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "onDestroy llamado")
    }
}