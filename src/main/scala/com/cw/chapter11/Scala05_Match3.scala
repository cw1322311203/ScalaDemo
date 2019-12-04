package com.cw.chapter11

object Scala05_Match3 {
  def main(args: Array[String]): Unit = {

    // TODO 匹配数组
    // Array(0) 匹配只有一个元素且为0的数组。
    // Array(x,y) 匹配数组有两个元素，并将两个元素赋值为x和y。当然可以依次类推Array(x,y,z) 匹配数组有3个元素的等等....
    // Array(0,_*) 匹配数组以0开始
    for (arr <- Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1))) {
      val result = arr match {
        case Array(0) => "0"
        case Array(x, y) => x + "=" + y
        case Array(0, _*) => "以0开头和数组"
        case _ => "什么集合都不是"
      }
      println("result = " + result)
    }


    // TODO 匹配列表
    for (list <- Array(List(0), List(1, 0), List(0, 0, 0), List(1, 0, 0))) {
      val result = list match {
        case 0 :: Nil => "0" // 空集合前就一个零 list(0)
        case x :: y :: Nil => x + " " + y // 空集合前两个元素 list(x,y)
        case 0 :: tail => "0 ..." // 集合元素以0开头
        case _ => "something else"
      }
      println(result)
    }


    // TODO 匹配元组
    for (pair <- Array((0, 1), (1, 0), (2, 1), (1, 0, 2))) {
      val result = pair match {
        case (0, _) => "0 ..." // 第一个元素为0,第二个元素任意
        case (y, 0) => y // 第一个元素为任意,第二个元素为0
        case (a, b) => (b, a) // 第一个和第二个元素均为任意
        case _ => "other" // 默认
      }
      println(result)
    }


    // TODO 对象匹配
    // 对象匹配，什么才算是匹配呢？规则如下:
    // 1) case中对象的unapply方法(对象提取器)返回Some集合则为匹配成功
    // 2) 返回none集合则为匹配失败

    // 1.构建对象时apply会被调用 ，比如 val n1 = Square(5)
    // 2.当将Square(n)写在case后时[case Square(n) => xxx]，会默认调用unapply方法(对象提取器)
    // 3.number 会被 传递给def unapply(z: Double) 的 z 形参
    // 4.如果返回的是Some集合，则unapply提取器返回的结果会返回给n这个形参
    object Square {
      // 当对对象进行匹配时,会自动调用unapply方法
      //def unapply(z: Double): Option[Double] = Some(math.sqrt(z))
      def unapply(z: Double): Option[Double] = None

      // 构建对象时apply会被调用,比如 val n1 = Square(5)
      def apply(z: Double): Double = z * z
    }

    val result = Square(6) // 36
    println(result)

    // 模式匹配使用：
    val number: Double = 36.0
    number match {
      case Square(n) => println(n) // 当对对象进行匹配时,会自动调用unapply方法
      case _ => println("nothing matched")
    }

  }
}
