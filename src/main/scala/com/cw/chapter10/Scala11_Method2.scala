package com.cw.chapter10

object Scala11_Method2 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)

    // TODO reduce
    // 数据减少,不是结果变少
    // 将集合的数据经过逻辑处理后只保留一个结果,具体的结果需要参考逻辑实现
    // 1+2=3 3+3=6 6+4=10
    //list.reduce((left,right)=>{left+right})
    //val result: Int = list.reduce(_ + _) // 10
    //val result: Int = list.reduce(_ - _) // -8

    // 从源码角度来讲,reduce和reduceLeft功能一样
    // 可以把reduceLeft看做简化版的foldLeft
    // reduceLeft就是调用的foldLeft[B](head)，并且是默认从集合的head元素开始操作的。
    //val result: Int = list.reduceLeft(_ - _) // -8

    // reversed.reduceLeft[B]((x, y) => op(y, x))
    // reversed ==> 4,3,2,1
    // reduceLeft ==> ((4-3)-2)-1
    // reduceRight ==> 1-(2-(3-4)) ==> -2
    val result: Int = list.reduceRight(_ - _)

    println(result)
  }
}
