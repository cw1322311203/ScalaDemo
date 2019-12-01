package com.cw.chapter09

object Scala03_Transform2 {
  def main(args: Array[String]): Unit = {

    // 隐式值也叫隐式变量，将某个形参变量标记为implicit，所以编译器会在方法省略隐式参数的情况下去搜索作用域内的隐式值作为默认参数
    //implicit val username: String = "wangwu"
    implicit val age: Int = 10

    // 隐式参数
    def test(implicit name: String = "zhangsan"): Unit = { // 隐式值和参数类型不匹配,使用默认值
      //def test(name: String = "zhangsan"): Unit = {
      println("Hello " + name)
    }

    def test1(implicit name: String): Unit = { // 隐式值和参数类型不匹配且没有默认值,报错
      println("Hello " + name)
    }

    // test("zhangsan")
    test() // 方法调用时,使用小括号会导致隐式值无法传递
    test // 方法调用时,不使用小括号可以传递隐式值
    // test1 // 方法调用时,不使用小括号可以传递隐式值

    // TODO 如果隐式参数存在默认值以及对应类型的隐式值,那么会优先采用隐式值,如果找不到,那么会使用默认值,如果没有默认值,那么会发生错误
  }
}
