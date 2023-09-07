package com.turun.mvp4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(),MainActivityContract.View {

    private lateinit var tvDate:TextView
    private lateinit var btnShowDate:Button

    private lateinit var mPresenter:MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dateCalculationManager=DateCalculationManager()
        this.mPresenter= MainActivityPresenter(dateCalculationManager)
        this.mPresenter.setView(this)
        this.mPresenter.created()

    }

    override fun showDate(date: String) {
        this.tvDate.text=date
    }

    override fun bindViews() {
        this.tvDate=findViewById(R.id.tv_date)
        this.btnShowDate=findViewById(R.id.btn_show_date)
    }

    override fun initClickListener() {
        this.btnShowDate.setOnClickListener {
            this.mPresenter.onShowButtonClick()
        }
    }
}