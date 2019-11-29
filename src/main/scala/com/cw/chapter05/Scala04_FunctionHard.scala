package com.cw.chapter05

object Scala04_FunctionHard {
  def main(args: Array[String]): Unit = {

    // 函数式编程 - 扩展
    // TODO 可变参数
    /*
    // 可变参数需要写到形参列表的最后
    def test(name: String*): Unit = {
      println(name)
    }
    */

    // 调用函数时,可传多个参数,也可以不传参数
    // test("zhangsan", "lisi", "wangwu") //WrappedArray(zhangsan, lisi, wangwu)
    // test() //List()

    // TODO 默认参数
    // 如果希望函数中某一个参数使用默认值,那么可以在声明时直接赋初始值
    // Scala函数的形参，在声明参数时，直接赋初始值(默认值)，这时调用函数时，如果没有指定实参，则会使用默认值。
    // 如果指定了实参，则实参会覆盖默认值。
    def test(name: String, age: Int = 20): Unit = {
      println(s"${name} - ${age}")
    }

    def test1(name2: String = "lisi", name1: String): Unit = {
      println(s"${name1} - ${name2}")
    }

    // TODO 调用函数时,参数匹配规则为从前到后,从左到右
    // test1("zhangsan") //这样是不正确的,zhangsan会按顺序赋给name2,但是name1既没有默认值,也没有进行赋值,导致出错
    // test1("zhangsan","wangwu")

    // TODO 带名参数
    /*
      如果存在多个参数，每一个参数都可以设定默认值，那么这个时候，传递的参数到底是覆盖默认值，还是赋值给没有默认值的参数，
      就不确定了(默认按照声明顺序[从左到右])。在这种情况下，可以采用带名参数
    */
    test1(name1 = "zhangsan")
  }
}
