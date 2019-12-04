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
    // set遍历
    for (elem <- set) {
      println(elem)
    }

    // println(set.mkString(","))

    // TODO 可变Set集合(mutable)
    val mset = mutable.Set(1, 2, 3, 4)
    // 可变集合的元素添加
    // 说明：如果添加的对象已经存在，则不会重复添加，也不会报错
    mset.add(4)
    mset += 6
    mset.+=(6)

    // 可变集合的元素删除
    mset -= 2
    mset.-=(4)
    mset.remove(6)
    // mset.drop()
    // mset.update()


    // 序号	方法	描述
    //  1	  def +(elem: A): Set[A]	为集合添加新元素，并创建一个新的集合，除非元素已存在
    //  2	  def -(elem: A): Set[A]	移除集合中的元素，并创建一个新的集合
    //  3	  def contains(elem: A): Boolean	如果元素在集合中存在，返回 true，否则返回 false。
    //  4	  def &(that: Set[A]): Set[A]	返回两个集合的交集
    //  5	  def &~(that: Set[A]): Set[A]	返回两个集合的差集
    //  6	  def ++(elems: A): Set[A]	合并两个集合
    //  7	  def drop(n: Int): Set[A]]	返回丢弃前n个元素新集合
    //  8	  def dropRight(n: Int): Set[A]	返回丢弃最后n个元素新集合
    //  9	  def dropWhile(p: (A) => Boolean): Set[A]	从左向右丢弃元素，直到条件p不成立
    //  10	def max: A //演示下	查找最大元素
    //  11	def min: A  //演示下	查找最小元素
    //  12	def take(n: Int): Set[A]	返回前 n 个元素

  }
}
