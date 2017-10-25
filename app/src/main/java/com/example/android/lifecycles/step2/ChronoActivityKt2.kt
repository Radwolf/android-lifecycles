package com.example.android.lifecycles.step2

import android.arch.lifecycle.LifecycleActivity
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.os.PersistableBundle
import android.os.SystemClock
import android.widget.Chronometer
import com.example.android.codelabs.lifecycle.R

/**
 * Created by Rul on 25/10/2017.
 */
class ChronoActivityKt2: LifecycleActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // The ViewModelStore provides a new ViewModel or one previously created.
        val chronometerViewModel = ViewModelProviders.of(this).get(ChronometerViewModelKt::class.java)

        // Get the chronometer reference
        val chronometer = findViewById(R.id.chronometer) as Chronometer

        if (chronometerViewModel.startDate == null) {
            // If the start date is not defined, it's a new ViewModel so set it.
            val startTime = SystemClock.elapsedRealtime()
            chronometerViewModel.setStartDate(startTime)
            chronometer.base = startTime
        } else {
            // Otherwise the ViewModel has been retained, set the chronometer's base to the original
            // starting time.
            chronometer.base = chronometerViewModel.startDate!!
        }

        chronometer.start()
    }
}