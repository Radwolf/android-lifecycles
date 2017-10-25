package com.example.android.lifecycles.step2

import android.arch.lifecycle.ViewModel

/**
 * Created by Rul on 25/10/2017.
 */
class ChronometerViewModelKt : ViewModel(){

    internal var startDate: Long? = null

    fun getStartDate(): Long? {
        return startDate
    }

    fun setStartDate(startDate: Long) {
        this.startDate = startDate
    }
}