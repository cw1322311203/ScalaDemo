package com.cw.chapter09

object Scala02_Transform1 {
  def main(args: Array[String]): Unit = {

    // 如果需要为一个类增加一个方法，可以通过隐式转换来实现。（动态增加功能）
    // 比如想为MySQL类增加一个delete方法
    // 在当前程序中，如果想要给MySQL类增加功能是非常简单的
    // 但是在实际项目中，如果想要增加新的功能就会需要改变源代码，这是很难接受的。
    // 而且违背了软件开发的OCP开发原则 (开闭原则 open close priceple)
    // 在这种情况下，可以通过隐式转换函数给类动态添加功能。

    implicit def transform(mysql: Mysql): Operator = {
      new Operator
    }

    val mysql = new Mysql
    mysql.select()
    mysql.delete()

  }
}

class Operator {
  def delete(): Unit = {
    println("delete...")
  }
}

class Mysql {
  def select(): Unit = {
    println("select...")
  }
}
