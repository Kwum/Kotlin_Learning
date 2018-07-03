package com.kotlin.demo

/**
 * @Description: 状态枚举
 * @Author Kwum
 * @Date 2018-07-03 14:33
 */
enum class StatusEnum(){
    冻结,
    正常
}

fun main(args: Array<String>) {
    println(StatusEnum.冻结.ordinal)
    println(StatusEnum.冻结.name)
    println(StatusEnum.正常.ordinal)
    println(StatusEnum.正常.name)
}
