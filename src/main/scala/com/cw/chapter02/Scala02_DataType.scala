package com.cw.chapter02

object Scala02_DataType {
  def main(args: Array[String]): Unit = {

    // TODO scala是完全面向对象的语言,所以没有基本数据类型
    //Scala 与 Java有着相同的数据类型，在Scala中数据类型都是对象，也就是说scala没有java中的原生类型
    // TODO scala中数字也是对象,可以调用方法
    val age: Int = 20

    // 基本数据类型: byte,short,int,long,double,float,boolean,char
    val b: Byte = 10
    val s: Short = 10
    val i: Int = 10
    val lon = 10000000000000L
    val f: Float = 10.0f
    val d: Double = 10
    val bln: Boolean = true
    val c: Char = 'c'
    val ii: Integer = 10

    val a: Any = 10
  }
}
