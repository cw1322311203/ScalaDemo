package com.cw.chapter02

object Scala03_Name {
  def main(args: Array[String]): Unit = {
    // 标识符

    // 首字符为操作符(比如+ - * / )，后续字符也需跟操作符 ,至少一个(反编译)
    // TODO scala中可以使用特殊符号作为标识符,其实是将特殊符号在编译时进行了转换
    val ++ = "123"
    println(++)

    val +-*/ = 123
    println(+-*/)

    val %@# = true
    println(%@#)

    // TODO scala中的下划线_有特殊的用途,不能独立当成变量名来使用
    val _ = "123"
    val a = "abc" + _

    println(a)

    // TODO 用反引号`....`包括的任意字符串，即使是关键字(39个)也可以 [true]

    val `private` = 123

    println(`private`)


  }
}
