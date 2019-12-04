package com.cw.chapter10

object Scala15_Method5 {
  def main(args: Array[String]): Unit = {

    // 变成List(1,2,3,4,5)
    // list(0)::list(1):::list(2):::Nil

    // TODO FlatMap
    val list = List(1, List(2, 3), List(4, 5), 6, List(7, 8))

    val list1: List[Any] = list.flatMap(any => {
      if (any.isInstanceOf[List[Int]]) {
        any.asInstanceOf[List[Int]]
      } else {
        List(any)
      }
    })
    println(list1)

    // TODO 并行

    val result1 = (0 to 100).map { case _ => Thread.currentThread.getName }
    val result2 = (0 to 100).par.map { case _ => Thread.currentThread.getName }
    println(result1)
    println(result2)

  }
}
