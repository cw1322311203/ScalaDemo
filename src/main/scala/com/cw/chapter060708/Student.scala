package com.cw.chapter060708

// 伴生类 (成员) : 都是通过对象访问的
class Student {
  private val sname = "zhangsan"
}

// 伴生对象 (静态) : 都是通过类名访问的
// 伴生对象可以访问伴生类的私有属性
// 创建伴生类对象,需要提供特殊的方法,实现相应的功能

object Student {

  // scala自动识别apply方法,用于创建伴生类对象
  def apply(s:String): Student = new Student()

  def test(): Unit = {
    //new Student().sname
  }
}
