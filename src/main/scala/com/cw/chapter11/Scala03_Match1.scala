package com.cw.chapter11

object Scala03_Match1 {
  def main(args: Array[String]): Unit = {
    for (ch <- "+-3!") {
      var sign = 0
      var digit = 0
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        case _ if ch.toString.equals("3") => digit = 3
        case _ => sign = 2
      }
      println(ch + " " + sign + " " + digit)
    }

    // 如果在case关键字后跟变量名，那么match前表达式的值会赋给那个变量
    val ch = 'V'
    ch match {
      case '+' => println("ok~")
      case mychar => println("ok~" + mychar)
      case _ => println("ok~~")
    }


  }
}
