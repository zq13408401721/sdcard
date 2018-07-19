package com.sdcard

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnClickListener()
    }

    fun setOnClickListener(){
        btn_readcard.setOnClickListener(this)
        btn_writecard.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        when(v!!.id){
            R.id.btn_readcard->{

            }
            R.id.btn_writecard->{

            }
        }
    }
}
