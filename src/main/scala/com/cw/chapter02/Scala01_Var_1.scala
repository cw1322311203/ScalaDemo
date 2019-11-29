package com.cw.chapter02

/**
  * 变量
  */
object Scala01_Var_1 {

  def main(args: Array[String]): Unit = {
    //  TODO scala为了让开发过程变得简单,可以将自动推断出来的内容省略
    val name = "lisi"

    val dog = new Dog()
    dog.name = "xxxx"
    // TODO var修饰的对象引用可以改变，val 修饰的则不可改变，但对象的状态(值)却是可以改变的。(比如: 自定义对象、数组、集合等等)
    println(dog.name)
  }
}

class Dog {
  var name: String = ""
}
