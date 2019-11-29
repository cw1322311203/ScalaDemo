package com.cw.chapter04

object Scala01_Process {
  def main(args: Array[String]): Unit = {
    //流程控制

    //  TODO 单分支
    val flg = true
    if (flg) {
      println("true")
    }

    //  TODO 双分支
    if (!flg) {
      println("true")
    } else {
      println("false")
    }

    //  TODO 多分支
    // 字符串可以使用==比较,但是一般还是采用equals进行比较
    val s = "a"
    if ("a".equals(s)) {
      println("aaaa")
    } else if ("b".equals(s)) {
      println("bbbb")
    } else {
      println("cccc")
    }


    var x = 4
    var y = 1
    if (x > 2) {
      if (y > 2) println(x + y)
      println("atguigu") // 输出内容 atguigu
    } else
      println("x is " + x)

  }
}
