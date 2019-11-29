package com.cw.chapter060708


object Scala14_Interface1 {
  def main(args: Array[String]): Unit = {
    // java中的接口无法直接构建对象,必须使用实现类
    // java中的接口是可以声明方法的,早期版本中声明的方法都是抽象的,新版本的是可以有默认实现的
    // java中的接口是可以声明属性的,属性值无法修改

    // scala中的特质也无法创建对象
    // scala中的特质是可以执行代码的
    // scala特质中声明的属性和方法都可以在混入的类中调用
    // new TestTrait14()

    val user1 = new User14()
    user1.username = "wangwu"
    println(user1.username)
    user1.test()
  }
}

trait TestTrait14 {
  // println("xxxxxx")
  var username: String = "zhangsan"

  def test(): Unit = {
    println("test...")
  }

  // 特质中可以声明抽象方法
  def test1()
}


class Person14 {

}

class User14 extends Person14 with TestTrait14 {
  def test1(): Unit = {
    println("111111")
  }
}