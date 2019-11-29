package com.cw.chapter060708

object Scala17_Interface4 {
  def main(args: Array[String]): Unit = {
    // val mysql = new MySql17()

    // TODO 动态混入特质,可以给对象动态扩展功能,扩展性非常强
    val mysql = new MySql17() with Operate17
    mysql.insert()
  }
}

trait Operate17 {

  def insert() {
    println("插入数据")
  }
}

class MySql17 {

}