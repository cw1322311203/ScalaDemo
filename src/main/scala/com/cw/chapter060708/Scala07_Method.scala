package com.cw.chapter060708

// 类的方法
// 所谓的方法,其实就是类中声明的函数,所以声明方式和函数是一样的,调用方式上有区别
object Scala07_Method {
  def main(args: Array[String]): Unit = {
    // 创建对象
    val user = new User07

    // val str: String = user.+("xxxx")
    // user + "xxxx" //等同于user.+("xxxx")
    // 1 to 5 //等同于1.to(5)

    println(user)
    //user.login()
  }
}

class User07 {

  def login(): Unit = {

  }

  // 方法一般不简化
  def logout(): Boolean = {
    true
  }
}