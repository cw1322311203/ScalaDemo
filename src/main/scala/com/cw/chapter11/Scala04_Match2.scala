package com.cw.chapter11

object Scala04_Match2 {
  def main(args: Array[String]): Unit = {
    // 可以匹配对象的任意类型，这样做避免了使用isInstanceOf和asInstanceOf方法

    // 类型匹配, obj 可能有如下的类型
    val a = 7
    val obj = if (a == 1) 1
    else if (a == 2) "2"
    else if (a == 3) BigInt(3)
    else if (a == 4) Map("aa" -> 1) // Map[String, Int]
    else if (a == 5) Map(1 -> "aa") // Map[Int, String]
    else if (a == 6) Array(1, 2, 3) // Array[Int]
    else if (a == 7) Array("aa", 1) // Array[Any]
    else if (a == 8) Array("aa") // Array[String]

    // 类型匹配时,泛型是不起作用的,Array[Int]并不是代表泛型,只是表示数据类型的规约
    val result = obj match {
      case a: Int => a
      case b: Map[String, Int] => "对象是一个字符串-数字的Map集合"
      case c: Map[Int, String] => "对象是一个数字-字符串的Map集合"
      case d: Array[String] => "对象是一个字符串数组" // 底层转为 new String[];
      case e: Array[Int] => "对象是一个数字数组"  // 底层转成new int[];
      case f: BigInt => Int.MaxValue
      case g: Array[Any] => "Any"
      case _ => "啥也不是"
    }

    println(result)

    // 在进行类型匹配时，编译器会预先检测是否有可能的匹配，如果没有则报错.


  }
}
