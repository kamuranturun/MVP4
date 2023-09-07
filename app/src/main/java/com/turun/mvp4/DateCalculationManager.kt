package com.turun.mvp4

import android.util.Log
import java.text.DateFormat
import java.util.*

class DateCalculationManager {

    //güncel tarih string formatında
    fun calculateDate():String{
        return DateFormat.getDateInstance().format(Date(Calendar.getInstance().timeInMillis))


    }
}