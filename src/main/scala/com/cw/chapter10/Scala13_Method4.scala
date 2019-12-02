package com.cw.chapter10

import scala.collection.mutable

object Scala13_Method4 {
  def main(args: Array[String]): Unit = {

    // 将两个Map进行合并,相同的key做累加,不同的key直接增加
    // a->4,b->2,c->5,d->1

    // map.get(key)==null, v
    // map.get(key) != null , map.get(key) + v
    val map1 = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    val map2 = mutable.Map("a" -> 3, "c" -> 2, "d" -> 1)

    val stringToInt: mutable.Map[String, Int] = map1.foldLeft(map2)((map, t) => {
      // "a"->1
      // map集合设值的方式 map(key)=value
      map(t._1) = map.getOrElse(t._1, 0) + t._2
      map
    })
    println(stringToInt)
    

  }
}
