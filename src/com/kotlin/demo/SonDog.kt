package com.kotlin.demo

/**
 * @Description: 狗儿子（继承狗爹）
 * @Author Kwum
 * @Date 2018-07-02 16:33
 */
class SonDog : DaddyDog(){//此处将class改写成object则表示单例模式

    /**
     * 重写（同理实现抽象方法是也是override关键字）
     */
    override fun bowWow(){
        println("BowWow BowWow meow masterBranch")
    }
}
