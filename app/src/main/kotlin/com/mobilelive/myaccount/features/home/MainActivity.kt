package com.mobilelive.myaccount.features.home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.ActionBar
import com.mobilelive.myaccount.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var toolbar: ActionBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.your_placeholder, HelloFragment())
        ft.commit()

        changeFragment.setOnClickListener {
            val helloSecondFragment = HelloSecondFragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.your_placeholder, helloSecondFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}
