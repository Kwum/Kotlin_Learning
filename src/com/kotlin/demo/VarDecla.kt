package com.kotlin.demo

/**
 * @Description: 变量声明、类型推断
 * @Author Kwum
 * @Date 2018-05-30 20:29
 */
fun main(args: Array<String>) {
    //变量
    var name = "kotlin"
    println(name)

    //常量
    val number = 1234
//    number = 1
    println(number)

    //定义变量
    var num : Int
    num = 999
    println(num)

    //Byte取值范围
    var maxByte:Byte = Byte.MAX_VALUE
    var minByte:Byte = Byte.MIN_VALUE
    println("Byte最大值：" + maxByte)
    println("Byte最小值：" + minByte)

    //Short取值范围
    var maxShort:Short = Short.MAX_VALUE
    var minShort:Short = Short.MIN_VALUE
    println("Short最大值：" + maxShort)
    println("Short最小值：" + minShort)

    //Int取值范围
    var maxInt:Int = Int.MAX_VALUE
    var minInt:Int = Int.MIN_VALUE
    println("Int最大值：" + maxInt)
    println("Int最小值：" + minInt)

    //Long取值范围
    var maxLong:Long = Long.MAX_VALUE
    var minLong:Long = Long.MIN_VALUE
    println("Long最大值：" + maxLong)
    println("Long最小值：" + minLong)
}
