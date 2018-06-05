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

    whenFun(10)
    whenFun(3)
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
 * when函数
 */
fun whenFun(score: Int){
    when(score){
        10 -> println("你牛逼！")
        9 -> println("你强！")
        8 -> println("你厉害！")
        7 -> println("你可以！")
        6 -> println("你行！")
        else -> println("可以")
    }
}