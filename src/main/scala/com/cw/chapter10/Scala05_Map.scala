package com.cw.chapter10

import scala.collection.mutable

object Scala05_Map {
  def main(args: Array[String]): Unit = {
    // Map集合:K-V对
    // hashmap.put("k","v")
    // Scala中k-v对数据采用特殊的方式声明
    // TODO 默认Map集合不可变
    val map: Map[String, Int] = Map("a" -> 1, "b" -> 2, "c" -> 3)
    println(map.mkString(","))
    // 增加数据
    val map1: Map[String, Int] = map + ("d" -> 4)
    val map11: Map[String, Int] = map + ("a" -> 6) // key相同则覆盖
    println(map == map1) //false
    println(map1.mkString(","))
    println(map11.mkString(","))
    // 删除数据
    val map2: Map[String, Int] = map - ("b")
    println(map2.mkString(","))
    val map3: Map[String, Int] = map - ("e") // 删除一个不存在key,不会报错
    println(map3.mkString(","))
    // 修改数据
    val map4: Map[String, Int] = map.updated("b", 5)
    println(map4.mkString(","))

    // 循环遍历
    // Scala为了防止集合出现空指针问题,提供了一个特殊的类:Option,有两个特殊的对象:Some,None
    // 如果确实没有获取到数据,为了不出现异常,Option类提供了有默认值的方法
    println(map.get("b")) // Some(2) 存在为Some,不存在为None
    println(map.get("b").get) // 2
    // println(map.get("f").get) // 报错
    println(map.get("f").getOrElse(0)) // 没有则返回默认值
    println(map.get("c").getOrElse(0)) // 没有则返回默认值


    // TODO 可变Map集合
    val mmap: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    //mmap.update()
    //mmap.drop()
    //mmap.+()
    //mmap + ()


  }
}
