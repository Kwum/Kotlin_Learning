package com.kotlin.demo


/**
 * @Description: 函数模块学习
 * @Author Kwum
 * @Date 2018-06-05 15:37
 */

fun main(args: Array<String>) {
    println(strOperate("aa"))
    println(strOperate("bbb"))

    //字符串对比
    println("aaa" == "aaa")
    println("aaa".equals("AAA", true)) //无视大小写

    println(add(3,5))

    //在方法体中写函数，类似C或C++的函数指针
    var addA = {x: Int, y:Int -> x+y}
    println(addA(3, 8))

    //另一种函数写法，函数式表达式
    var addB:(Int, Int)->Int = {x, y -> x+y}
    println(addB(3, 8))

    var dog = SonDog()
    dog.bowWow()
}

/**
 * 引号中对参数的直接引用
 * 参数类型后面加上?之后，表示参数可以为空
 * fun strOperate(str: String?):String{
 */
fun strOperate(str: String):String{
    var result = ""
    if (str.length >= 3){
        result = "${str}${str.length}"
    }else {
        result = "${str}"
    }
    return result
}

/**
 * 函数简写
 */
fun add(x: Int, y: Int):Int = x+y


