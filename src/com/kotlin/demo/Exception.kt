package com.kotlin.demo

import java.math.BigInteger

/**
 * @Description: 异常处理
 * @Author Kwum
 * @Date 2018-07-02 15:07
 */
fun main(args: Array<String>) {
    var a:Int = 0
    var b:Int = 0

    println("请输入第一个数字：")
    var str1 = readLine()

    try {
        a = str1!!.toInt()
    } catch (e:Exception){
        println("仅限输入数字")
    }
    println("请输入第二个数字：")

    var str2 = readLine()
    try {
        b = str2!!.toInt()
    } catch (e:Exception){
        println("仅限输入数字")
    }

    println(str1 + " + " + str2 + " = " +  a + b)

    var num:BigInteger = BigInteger.ONE
}