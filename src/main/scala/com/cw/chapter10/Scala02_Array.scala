package com.cw.chapter10

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Scala02_Array {

  // public static void main(String[] args)
  def main(args: Array[String]): Unit = {

    // java数组:int[] ints = new int[3]{1,2,3};
    //          ints[0] = 1;
    //          int i=ints[0];


    // TODO Scala中的数组(不可变),使用Array对象实现,使用中括号声明数组的类型
    // Array[String]
    // Scala可以使用简单的方式创建数组
    // Array可以通过apply方法来创建数组对象

    val ints: Array[Int] = Array(1, 2, 3, 4)
    val arr: Array[Int] = new Array[Int](10)
    arr(0) = 1
    arr(1) = 2
    println(arr.mkString(","))
    // 访问数组 : 使用小括号,增加索引的方式来访问数组
    println(ints(0))

    // 数组长度
    println(ints.length)
    // ints.+("ssssss")
    // ints + "ssssss"
    println(ints.+("sss"))
    println(ints)

    // 将数组转换成字符串打印
    println(ints.mkString("|"))

    // 将数组中的每个元素打印
    for (elem <- ints) {
      println(elem)
    }


    //def printlnXXX(i: Int): Unit = {
    //      println(i)
    //    }

    // foreach方法会将数组中的每一个元素进行循环遍历,执行指定函数实现逻辑
    //ints.foreach(printlnXXX)

    //ints.foreach((i:Int)=>{println(i)})
    //ints.foreach((i)=>{println(i)})
    //ints.foreach({println(_)})
    //ints.foreach(println(_))
    //ints.foreach(println)

    // 增加元素
    // 采用方法向数组中增加新的元素,但是不会对原有数组造成影响,而是产生新的数组
    // :+ 在集合最右边新增元素
    // +: 在集合最左边新增元素
    val ints1: Array[Int] = ints :+ (5) // ints :+ 5
    val ints2: Array[Int] = 5 +: (ints)
    println(ints1.mkString(","))
    println(ints2.mkString(","))
    // println(ints == ints1)

    // 修改元素
    //ints.update(1, 5)
    //println(ints.mkString(","))


    // TODO 可变数组ArrayBuffer
    // ArrayBuffer是变长数组，类似java的ArrayList
    // val arr2 = ArrayBuffer[Int]() 也是使用的apply方法构建对象
    val arrayBuffer: ArrayBuffer[Int] = ArrayBuffer(5, 6, 7, 8)

    // 查询值
    //println(arrayBuffer(0))
    // 修改值
    //arrayBuffer(0) = 9

    // 将数组转换成字符串
    println(arrayBuffer.mkString(","))

    // 循环遍历
    // arrayBuffer.foreach(println)

    // 向指定的位置增加元素
    // arrayBuffer.insert(1, 9)
    // 在数组最后增加一个数据
    //val buffer: ArrayBuffer[Int] = arrayBuffer += (9)

    //  def append(elems: A*) { appendAll(elems) } 接收的是可变参数.
    // 每append一次，arr在底层会重新分配空间，进行扩容，arr2的内存地址会发生变化，也就成为新的ArrayBuffer
    arrayBuffer.append(9)
    // 地址没有发生变化
    //println(arrayBuffer == buffer)

    //arrayBuffer.foreach(println)\
    println(arrayBuffer.mkString(","))

    // 删除数据
    // arrayBuffer -= (1)
    // 删除指定位置数据,并将删除的元素返回
    // val i: Int = arrayBuffer.remove(1)
    // println("i = " + i)
    // 删除指定位置开始n个数据
    arrayBuffer.remove(1, 2)
    println(arrayBuffer.mkString(","))

    // TODO 可变数组ArrayBuffer和不可变数组Array的转换
    //val buffer: mutable.Buffer[Int] = ints.toBuffer
    val array: Array[Int] = arrayBuffer.toArray


    // TODO 多维数组
    // 有三个元素[一维数组]
    val array1 = Array.ofDim[Int](3, 4)
    array1(1)(1) = 9
    for (item <- array1) {
      for (item2 <- item) {
        print(item2 + "\t")
      }
      println()
    }

    println("===================")

    for (i <- 0 to array1.length - 1) {
      for (j <- 0 to array1(i).length - 1) {
        printf("arr[%d][%d]=%d\t", i, j, array1(i)(j))
      }
      println()
    }

  }
}
