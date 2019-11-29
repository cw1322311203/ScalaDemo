package com.cw.chapter060708

object Scala08_Method1 {
  def main(args: Array[String]): Unit = {

    // 采用伴生对象来创建伴生类
    val student = Student("zhangsan")
    // Student.apply
    println(student)

    //val range=Range(1,5)
    //println(range)

  }
}
