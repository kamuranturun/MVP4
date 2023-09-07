package com.turun.mvp4

interface MainActivityContract {

    interface View{//görünümler
        fun showDate(date:String)//tarih

        fun bindViews()//görünüm

        fun initClickListener()//tıklama
    }

    interface Presenter{//sunum

        fun setView(view:View)//görünümleri çalıştır

        fun created()//presenter oluştur


        fun onShowButtonClick()//tıklama

    }
}