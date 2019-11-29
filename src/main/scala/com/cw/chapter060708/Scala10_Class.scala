package com.cw.chapter060708

object Scala10_Class {
  def main(args: Array[String]): Unit = {
    val user = new User10()

    user.test1()

    val user1: Person = new User10()
    user1.test1()

    println(user1.email)
  }
}

// 声明类
// 父类,继承
// 类可以声明为抽象的 abstract
abstract class Person {

  var name: String = _
  // scala中属性也可以重写,因为属性可以抽象
  // 属性只有声明,而没有初始化,那么就是抽象属性
  // 抽象属性在编译为class文件时,不产生属性,但是产生抽象的getter方法
  // 底层是public abstract String sex();
  var sex: String

  val email: String = "zzzzz"

  // 声明抽象方法,方法只有声明,没有实现,不需要abstract关键字声明
  def test()

  def test1(): Unit = {
    println("parent test1...")
    println(email)
  }
}


class User10 extends Person {

  // 重写属性,补全属性
  var sex: String = "XXXX"

  // 属性可以被覆盖(重写),但是不能重写父类var声明的变量
  override val email: String = "yyyyy"

  // 重写抽象方法,补全方法即可
  def test(): Unit = {
    println("xxxxx")
  }

  // TODO scala如果子类重写父类的非抽象方法,需要增加override关键字
  override def test1(): Unit = {
    println("child test1...")
  }


}
