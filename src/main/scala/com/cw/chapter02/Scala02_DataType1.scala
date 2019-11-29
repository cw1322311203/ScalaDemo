package com.cw.chapter02

object Scala02_DataType1 {
  def main(args: Array[String]): Unit = {

    val i: Int = 10

    val d = i.toDouble

    println(d)

    // TODO Unit表示无值，和其他语言中void等同。用作不返回任何结果的方法的结果类型。Unit只有一个实例值，写成()。
    println(Unit)

    // TODO Null 类型只有一个实例值 null
    // TODO null，类似于Java中的null引用。

    val s: String = null

    // null可以赋值给任意引用类型(AnyRef)，
    // 但是不能赋值给值类型(AnyVal: 比如 Int, Float, Char, Boolean, Long, Double, Byte, Short)
    // ii: Int = null

  }

  /*
     TODO Nothing它是任何其他类型的子类型。
    当一个函数，我们确定没有正常的返回值，可以用Nothing 来指定返回类型，
    这样有一个好处，就是我们可以把返回的值（异常）赋给其它的函数或者变量（兼容性）
   */
  def f1(): Nothing = {
    throw new Exception()
  }
}
