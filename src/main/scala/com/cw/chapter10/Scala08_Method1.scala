package com.cw.chapter10

object Scala08_Method1 {
  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4)

    // TODO filter :对集合的数据进行筛选过滤,true保留,false不保留
    val filterList: List[Int] = list.filter(x => x % 2 == 0)
    println(filterList.mkString(","))

    // TODO 拉链:Zip
    // 拉链的本质就是两个集合的合并操作，合并后每个元素是一个 对偶元组。
    // 如果两个集合个数不对应，会造成数据丢失。
    // 集合不限于List, 也可以是其它集合比如 Array
    // 如果要取出合并后的各个对偶元组的数据，可以遍历,取出时，按照元组的方式取出即可
    val list1 = List(1, 2, 3, 7)
    val list2 = List(3, 4, 5, 6)

    // 将两个集合数据进行关联,关联后的数据形成了元组
    val tuples: List[(Int, Int)] = list1.zip(list2)
    println(tuples.mkString(","))

    // 集合并集
    val unionList: List[Int] = list1.union(list2)
    println(unionList)

    // 集合交集
    val intersectList: List[Int] = list1.intersect(list2)
    println(intersectList)

    // 集合差集
    val diffList: List[Int] = list1.diff(list2)
    println(diffList)
  }
}
