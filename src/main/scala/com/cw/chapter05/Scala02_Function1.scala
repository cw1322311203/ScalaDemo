package com.cw.chapter05

object Scala02_Function1 {
  def main(args: Array[String]): Unit = {

    // 函数:入参(方法参数)   出参(返回值)
    // 返回值形式1:  def 函数名(参数列表) : 数据类型 = {函数体}  // 返回值确定,清晰
    // 返回值形式2:  def 函数名(参数列表) = {函数体}  // 有返回值, 类型是推断出来的
    // 返回值形式3:  def 函数名(参数列表) {函数体}  // 无返回值 Unit
    // 形参列表和返回值的数据类型可以是值类型和引用类型
    // Scala语法中任何的语法结构都可以嵌套其他语法结构(灵活)，即：函数/方法中可以再声明/定义函数/方法，类中可以再声明类。


    // TODO 无参,无返回值
    // 函数的形参列表可以是多个, 如果函数没有形参，调用时 可以不带()
    def test(): Unit = {
      println("Test")
    }

    //test()

    // TODO 有参,无返回值
    // 函数没有重载的概念
    // 如果在同一个作用域中,函数不能同名
    def test1(s: String): Unit = {
      println(s)
    }

    // TODO 有参,有返回值
    def test2(s: String): String = {
      return s + "....."
    }

    val rtnVal: String = test2("zhangsan")
    // println(rtnVal)

    // TODO 无参,有返回值
    def test3(): String = {
      return "Hello World!"
    }

    println(test3())


    // TODO scala中没有throws关键字,所以函数中如果有异常发生,也不需要在函数声明时抛出异常

  }
}
