package com.cw.chapter10

object Scala01_List {
  def main(args: Array[String]): Unit = {

    // Java中的集合: List,Set,Map (可变)
    // List:有序,可重复
    // LinkedList,ArrayList
    // Set:无序,不可重复
    // HashSet,TreeSet
    // Map:无序,(K-V)key不能重复,value可重复
    // HashMap,Hashtable,TreeMap

    // 数组(不可变)
    // int[] ints = new int[4]

    // Scala中集合,主要分为两大类:可变mutable & 不可变immutable
    // 不可变集合：scala.collection.immutable
    // 可变集合：  scala.collection.mutable

    // Scala默认采用不可变集合，对于几乎所有的集合类，Scala都同时提供了可变(mutable)和不可变(immutable)的版本

    // Scala的集合有三大类：序列Seq、集Set、映射Map，所有的集合都扩展自Iterable特质，
    // 在Scala中集合有可变（mutable）和不可变（immutable）两种类型。

    // 不可变集合：scala不可变集合，就是这个集合本身不能动态变化。(类似java的数组，是不可以动态增长的)
    // 可变集合:可变集合，就是这个集合本身可以动态变化的。(比如:ArrayList , 是可以动态增长的)



  }
}
