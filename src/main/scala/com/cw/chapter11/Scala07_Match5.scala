package com.cw.chapter11

object Scala07_Match5 {
  def main(args: Array[String]): Unit = {

    // 样例类 case class
    // TODO 基本介绍
    // 1) 样例类仍然是类
    // 2) 样例类用case关键字进行声明。
    // 3) 样例类是为模式匹配(对象)而优化的类
    // 4) 构造器中的每一个参数都成为val — —  除非它被显式地声明为var
    // 5) 在样例类对应的伴生对象中提供apply方法让你不用new关键字就能构造出相应的对象
    // 6) 提供unapply方法让模式匹配可以工作
    // 7) 将自动生成toString、equals、hashCode和copy方法(有点类似模板类，直接给生成，供程序员使用)
    // 8) 除上述外，样例类和其他类完全一样。你可以添加方法和字段，扩展它们

    //val dollar = new Dollar(1.0)
    val dollar = Dollar(1.0) // TODO 伴生对象提供apply方法,不用new
    println(dollar.value)

    // TODO 当我们有一个类型为Amount的对象时，可以用模式匹配来匹配他的类型，并将属性值绑定到变量(即：把样例类对象的属性值提取到某个变量)
    for (amt <- Array(Dollar(1000.0), Currency(1000.0, "RMB"), NoAmount)) {
      val result = amt match {
        case Dollar(v) => "$" + v
        case Currency(v, u) => v + " " + u
        case NoAmount => ""
      }
      println(amt + ": " + result)
    }

    // TODO copy方法可以创建一个与现有对象值相同的新对象 ，并可以通过带名参数来修改某些属性
    val amt = Currency(29.95, "RMB")

    val amt1 = amt.copy()
    val amt2 = amt.copy(value = 19.95)
    val amt3 = amt.copy(unit = "英镑")

    println(amt)
    println(amt2)
    println(amt3)


    // 什么是中置表达式？1 + 2，这就是一个中置表达式。
    // 如果unapply方法产出一个元组，你可以在case语句中使用中置表示法。比如可以匹配一个List序列
    var list = List(1, 3, 5, 9)
    list match {
      case first :: second :: rest => println(first + " ** " + second + " ** " + rest)
      case _ => println("匹配不到...")
    }


  }
}

// TODO 密封类(sealed)介绍
// 1) 如果想让case类的所有子类都必须在申明该类的相同的源文件中定义，可以将样例类的通用超类声明为sealed，这个超类称之为密封类。
// 2) 密封就是不能在其他文件中定义子类。
// 当Amount没有声明sealed时,可以在其他文件中定义样例子类,声明后就只能在本文件声明子类了
// 所有的样例类最好在同一个文件中
abstract sealed class Amount

// 说明: 这里的 Dollar，Currencry, NoAmount  是样例类。
case class Dollar(value: Double) extends Amount

case class Currency(value: Double, unit: String) extends Amount

case object NoAmount extends Amount