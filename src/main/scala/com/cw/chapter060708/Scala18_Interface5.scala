package com.cw.chapter060708

object Scala18_Interface5 {
  def main(args: Array[String]): Unit = {
    var mysql = new MySql18()
    mysql.getMessage
  }
}

// TODO 特质可以继承类

//trait Operate18 extends Exception {
trait Operate18 {
  // TODO 特质可以使用的范围
  this: Exception =>
  def insert() {
    println("插入数据")
    this.getMessage
  }
}

class MySql18 extends Exception with Operate18 {

}