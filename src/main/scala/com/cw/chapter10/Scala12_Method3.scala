package com.cw.chapter10

import scala.collection.mutable.ArrayBuffer

object Scala12_Method3 {
  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4)

    // TODO fold
    // fold函数将上一步返回的值作为函数的第一个参数继续传递参与运算，直到list中的所有元素被遍历。
    // 折叠,也可以对集合数据进行简化,获取最终的一条结果
    // fold方法可以传递两个部分的参数
    // 第一个部分表示集合之外的数据,第二个部分表示数据进行的逻辑处理
    //val i: Int = list.fold(100)(_ + _)// 110
    //val i: Int = list.fold(100)(_ - _) // 90
    //val i: Int = list.foldLeft(100)(_ - _) // 90
    // 9,7,4,0
    val i1: List[Int] = list.scanLeft(10)(_ - _) // List(10, 9, 7, 4, 0)
    println(i1)

    //  reduceLeft就是调用的foldLeft[B](head)，并且是默认从集合的head元素开始操作的。
    // reverse.foldLeft(z)((right, left) => op(left, right))
    // reverse ==> 4,3,2,1
    // foldLeft ==> (((10-4)-3)-2)-1
    // foldRight ==> 1-(2-(3-(4-10)))
    // 4-10=-6 3-(-6)=9 2-9=-7 1-(-7)=8
    val i2: Int = list.foldRight(10)(_ - _) // 8
    println(i2)
    // 1-(2-(3-(4-10))
    val i3: List[Int] = list.scanRight(10)(_ - _) // List(8, -7, 9, -6, 10)
    println(i3)

    // TODO foldLeft和foldRight 缩写方法分别是：/:和:\
    val list4 = List(1, 9, 2, 8)

    def minus(num1: Int, num2: Int): Int = {
      num1 - num2
    }

    var i6 = (1 /: list4) (minus)
    println(i6)

    i6 = (100 /: list4) (minus)
    println(i6)

    i6 = (list4 :\ 10) (minus)
    println(i6)


    // TODO 扫描 scanLeft
    // 扫描，即对某个集合的所有元素做fold操作，但是会把产生的所有中间结果放置于一个集合中保存

    // ((((5-1)-2)-3)-4)-5
    // 4,2,-1,-5,-10
    val i8 = (1 to 5).scanLeft(5)(minus) // Vector(5, 4, 2, -1, -5, -10)
    println(i8)

    def add(num1: Int, num2: Int): Int = {
      num1 + num2
    }

    // ((((5+1)+2)+3)+4)+5
    val i9 = (1 to 5).scanLeft(5)(add) // Vector(5, 6, 8, 11, 15, 20)
    println(i9)

    // 1+(2+(3+(4+(5+5))))
    val i10 = (1 to 5).scanRight(5)(add) // Vector(20, 19, 17, 14, 10, 5)
    println(i10)

    // TODO flodLeft案例

    // TODO 将sentence 中各个字符，通过foldLeft存放到一个ArrayBuffer中
    val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"

    def putArry(arr: ArrayBuffer[Char], c: Char): ArrayBuffer[Char] = {
      arr.append(c)
      arr
    }

    //创建val arr = ArrayBuffer[Char]()， 作为第一个参数传入
    val arr = ArrayBuffer[Char]()
    val ab: ArrayBuffer[Char] = sentence.foldLeft(arr)(putArry)
    println(ab.mkString(","))

    // todo 使用映射集合，统计一句话中，各个字母出现的次数
    def charCount(map: Map[Char, Int], c: Char): Map[Char, Int] = {
      map + (c -> (map.getOrElse(c, 0) + 1))
    }

    val map2 = sentence.foldLeft(Map[Char, Int]())(charCount)
    println(map2)



  }
}
