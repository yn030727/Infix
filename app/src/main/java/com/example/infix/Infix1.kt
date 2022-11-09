package com.example.infix

//String类的拓展函数，不是顶层函数
//加上infix关键字后变成了infix函数
//之后除了传统的调用方式以外，我们还可以使用一种特殊的语法糖格式调用
infix fun String.beginWith(prefix:String)=startsWith(prefix)