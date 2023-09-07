package com.turun.mvp4

import android.util.Log

class MainActivityPresenter(dateCalculationManager: DateCalculationManager) :
    MainActivityContract.Presenter {

    private lateinit var mView: MainActivityContract.View
    private var mDateCalculationManager = dateCalculationManager

    override fun setView(view: MainActivityContract.View) {
        this.mView = view

    }

    override fun created() {
        this.mView.bindViews()
        this.mView.initClickListener()

    }

    override fun onShowButtonClick() {
        val currentDate = this.mDateCalculationManager.calculateDate()
        this.mView.showDate(currentDate)
    }


}