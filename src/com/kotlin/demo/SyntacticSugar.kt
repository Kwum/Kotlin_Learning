package com.kotlin.demo

import java.util.*

/**
 * @Description: Kotlin的一些语法
 * @Author Kwum
 * @Date 2018-06-13 11:14
 */

fun main(args: Array<String>) {
//    whenFun(10)
//    whenFun(3)

//    range()

//    list()

    println(map("aa"))

    //字符串整形转换
    var aa = 1
    aa.toString()
    var bb = "2"
    bb.toInt()

    println("请输入任意字符：")
    //键盘录入
    var cc = readLine()
    println("输入的是：" + cc)

    //异常捕获
    try {
        cc!!.toInt()
    }catch (e: Exception){
        println("输入的不是数字吧哈哈")
    }
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

/**
 * 区间
 */
fun range(){
    //区间 1-100
    var nums = 1 .. 100
    var result = 0
    //循环遍历写法 in
    for( num in nums ){
        result += num
    }
    println(result)

    //1-99
    nums = 1 until 100
    //总数
    println(nums.count())
    //倒序 步长2
    for ( num in nums.reversed() step 2 ){
        println(num)
    }
}

/**
 * 列表
 */
fun list(){
    var list = listOf("哈哈哈", "呵呵呵", "嘿嘿嘿")
    for ( (i, e) in list.withIndex()){
        println("$i $e")
    }
}

/**
 * map
 */
fun map(key: String): String?{
    var map = TreeMap<String, String>()
    map["aa"] = "哈哈"
    map["ee"] = "呵呵"

    return map[key]
}
