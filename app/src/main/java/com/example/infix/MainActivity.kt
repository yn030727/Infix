package com.example.infix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if("Hello Kotlin".startsWith("Hello")){
            //下面这段代码的结果一定是true
        }
        "Hello Kotlin" beginWith "Hello"
        //由于infix语法糖的特殊形式，他有两个限制
        //1.infix函数不能被定义成顶层函数，必须是某个类的成员函数，可以使用拓展函数的方式将它定义到某个类当中
        //2.infix函数必须接收，且只能接收一个参数
    }
}