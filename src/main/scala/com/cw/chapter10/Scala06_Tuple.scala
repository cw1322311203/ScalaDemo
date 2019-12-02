package com.cw.chapter10

object Scala06_Tuple {
  def main(args: Array[String]): Unit = {

    // Tuple:元祖
    // Map(k -> v)
    // 将无关的数据当成一个整体来使用
    // empid,email,ordernum
    // 使用小括号将数据关联在一起,形成一个整体
    // 元祖中最多的元素数据的个数为22个
    val tuple: (String, Int, String) = ("zhangsan", 11111, "xxxxxx")

    // TODO 访问元祖中的数据,调用相应的顺序编号: _顺序号,也可以通过索引
    println(tuple._1) // 访问元祖的第一个元素,从1开始
    println(tuple._2)
    println(tuple._3)
    println(tuple.productElement(0))// 访问元祖的第一个元素,从0开始

    // 循环遍历元祖
    for (elem <- tuple.productIterator) {
      println(elem)
    }

    // TODO 如果元祖中元素的个数为2,那么称之为对偶,类似于Map中键值对
    val tuple1: (Int, String) = (1, "zhangsan")
    val tupleMap: Map[Int, String] = Map((1, "zhangsan"))

    tupleMap.foreach(t => {
      println(t)
    })
    tupleMap.foreach(t => {
      println(t._1 + "=" + t._2)
    })
  }
}

class User {
  var username: String = _
  var age: Int = _
}
