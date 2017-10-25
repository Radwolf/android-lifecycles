package com.example.android.lifecycles.step1

/**
 * Created by Rul on 25/10/2017.
 */
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Chronometer

import com.example.android.codelabs.lifecycle.R


class ChronoActivityKt1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chronometer = findViewById(R.id.chronometer) as Chronometer

        chronometer.start()
    }
}
