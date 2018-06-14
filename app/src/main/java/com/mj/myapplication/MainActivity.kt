package com.mj.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    val list= arrayListOf<Int>()
    private var a:Int=0;
    private var b:Int=0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        a=10
        b=20
        var c:Int=a+b
        Log.d("Sum", c.toString())
list.add(1)
        list.add(2)
        list.add(3)
        list.add(4)
        list.add(5)
        list.add(6)
        list.add(7)
        list.add(8)
        list.add(9)
        list.add(10)
        var sum=0
        for (i in list)
        {
            sum=sum+i
        }
        Log.d("SumOfArray: ",(sum).toString())


    }
}
