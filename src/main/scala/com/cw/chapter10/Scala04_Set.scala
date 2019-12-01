package com.cw.chapter10

import scala.collection.mutable

object Scala04_Set {
  def main(args: Array[String]): Unit = {

    // TODO Set集合 : 无序,不可重复
    // 默认scala提供的set集合就是不可变的(immutable)
    val set: Set[Int] = Set(1, 2, 3, 4)
    // 增加数据
    println(set + 11)
    // 删除数据
    println(set - 3)

    for (elem <- set) {
      println(elem)
    }

    // println(set.mkString(","))

    // TODO 可变Set集合(mutable)
    val mset = mutable.Set(1, 2, 3, 4)
    // mset.drop()
    // mset.update()
    // mset.+()
  }
}
