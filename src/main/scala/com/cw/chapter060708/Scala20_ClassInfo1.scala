package com.cw.chapter060708

// Scala会自动导入scala包中的类
object Scala20_ClassInfo1 extends App {
  println("zhangsan...")
  // Color
}

// 枚举
class Color extends Enumeration {
  // 隐式转换
  var RED = Value(1, "red")
  var YELLOW = Value(2, "yellow")
}