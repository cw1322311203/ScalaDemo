package com.cw.chapter04

import scala.collection.immutable
import scala.util.control.Breaks._

object Scala03_For {
  def main(args: Array[String]): Unit = {
    // TODO java中的for循环

    /*
      for (int j = 0; j <10 ; j++) {
            //循环体
        }

        for (String s: strings){
            //循环体
        }
     */
    // TODO scala中for循环

    // TODO 使用 1 to 5 表示循环的范围,从1到5(包含5)
    for (i <- 1 to 5) {
      print(s"i = ${i} \t")
    }

    // TODO 使用 1 until 5 表示循环的范围,从1截止到5(不包含)

    // 0.until(5) ==> 0 until 5
    // 0.to(5) ==> 0 to 5
    // 1.+(1) ==> 1 + 1
    println()

    //def until(end: Int): Range = Range(self, end)
    for (i <- 1 until 5) {
      print(s"i = ${i} \t")
    }

    println()

    // TODO Range(start,end) 范围对象,等同于until,不包含end
    // for循环的步长可以使用Range控制
    for (i <- Range(0, 5, 2)) {
      print(s"i = ${i} \t") //i = 0 	i = 2 	i = 4
    }

    for (i <- 1 to 3) {
      for (j <- 1 until 3) {
        println(s"${i} = ${j}")
      }
    }

    // TODO 九层妖塔
    /*
          *
         ***
        *****
     */
    for (i <- Range(1, 18, 2)) {
      println(" " * ((18 - i) / 2) + "*" * i + " " * ((18 - i) / 2))
    }

    // TODO 没有关键字，所以范围后一定要加；来隔断逻辑
    for (i <- Range(1, 18, 2); j = (18 - i) / 2) {
      println(" " * j + "*" * i + " " * j)
    }

    // for循环中可以使用一行代码声明变量,也可以使用多行来声明变量,但是需要将小括号变成大括号
    // 表达式如果有多行代码,那么可以采用大括号声明
    // TODO 当for 推导式仅包含单一表达式时使用圆括号，当其包含多个表达式时使用大括号
    for {i <- Range(1, 18, 2)
         j = (18 - i) / 2} {
      println(" " * j + "*" * i + " " * j)
    }

    // TODO 循环守卫
    // 循环守卫，即循环保护式（也称条件判断式，守卫）。保护式为true则进入循环体内部，为false则跳过，类似于continue
    for (i <- 1 to 5 if i % 2 == 0) {
      println(s"${i}")
    }

    // TODO 默认情况下,for循环的返回值为()
    val unit: Unit = for (i <- 1 to 3) {
      "abc"
    }

    // TODO yield:将遍历过程中处理的结果返回到一个新Vector集合中，使用yield关键字
    val res: immutable.IndexedSeq[Int] = for (i <- 1 to 10) yield i * 2
    println(res)

    // TODO 中断循环break
    // java中采用break语法实现
    // scala中没有break关键字,但是可以采用对象的方式进行中断

    // try {} catch
    //Breaks.breakable()
    breakable {
      for (i <- 1 to 10) {
        if (i == 5) {
          //def break(): Nothing = { throw breakException }
          break
        }
        println(s"i = ${i}")
      }
    }

    breakable {
      for (i <- 1 to 20) {
        if (i >= 9) {
          println()
          break()
        }
        print(i + "\t")
      }
    }

    println("循环结束")

  }
}
