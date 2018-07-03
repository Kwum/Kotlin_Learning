package com.kotlin.demo

/**
 * @Description: 狗爹（用于继承）
 * @Author Kwum
 * @Date 2018-07-02 16:32
 */
open class DaddyDog{ //抽象类这用abstract

    /**
     * 叫（测试方法用abstract关键字）
     */
    open fun bowWow(){
        println("BowWow BowWow")
    }
}
