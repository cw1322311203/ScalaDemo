package com.cw.chapter10

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Scala03_Seq {
  def main(args: Array[String]): Unit = {

    // TODO 序列 seq

    // TODO 不可变集合
    // TODO 默认scala提供的集合都是不可变的(immutable)
    val list: List[Int] = List(1, 2, 3, 4)
    val list1: List[Int] = List(5, 6, 7, 8)

    // 通过索引获取数据
    //println(list(0))

    // 增加数据

    // TODO :+ 在集合最后面添加元素   +: 在集合最前面添加元素
    //val list1: List[Int] = list :+ 1
    //val list1: List[Int] = 1 +: list // 产生新的集合
    //println(list1.mkString(","))
    //println(list == list1) //false

    // TODO ++ 用于连接两个集合
    //val list2: List[Int] = list.++(list1)
    //val list2: List[Int] = list ++ list1
    //println(list2.mkString(","))

    // TODO ::    x::list表示在list前面添加元素x
    // x::list等价于list.::(x)
    //val list3: List[Int] = list.::(9)
    //println(list3.mkString(","))
    // list中的冒号运算符的运算顺序从右到左
    val list4: List[Int] = 7 :: 8 :: 9 :: list
    //val list4: List[Int] = (7 :: (8 :: (9 :: list)))

    // 将集合本身加了进去,并不是把集合元素加进去了
    // :: 符号::表示向集合中  新建集合添加元素
    // ::: 运算符是将集合中的每一个元素加入到空集合中去
    val list5 = 9 :: list1 :: list // 9,List(5, 6, 7, 8),1,2,3,4
    val list6 = 9 :: list1 ::: list // 9,5,6,7,8,1,2,3,4

    println(list5.mkString(","))
    println(list6.mkString(","))


    // TODO 特殊List集合 : 空集合Nil
    println(List()) // List()
    println(Nil) // List()
    println(1 :: 2 :: 3 :: Nil)


    // 修改
    val list7: List[Int] = list.updated(2, 5)
    println(list7.mkString(","))

    // 删除数据

    val list8: List[Int] = list.drop(2)
    println(list8.mkString(","))

    // 查询数据
    for (elem <- list7) {
      println(elem)
    }

    // TODO 可变集合ListBuffer

    var mlist = ListBuffer(1, 2, 3, 4)
    //mlist.insert()
    //mlist.update()
    //mlist.drop()
    //mlist.remove()

    // TODO 集合的属性
    // 头
    println(mlist.head) // 1
    // 尾(除了头以外)
    println(mlist.tail) // ListBuffer(2, 3, 4)
    // 最后一个
    println(mlist.last)
    // 初始化(除了最后一个)
    println(mlist.init)


    // TODO 队列(一定可变)
    // 队列是一个有序列表，在底层可以用数组或是链表来实现。
    // 其输入和输出要遵循先入先出的原则。即：先存入队列的数据，要先取出。后存入的要后取出
    val q = mutable.Queue(1, 2, 3, 4)

    // 返回队列的第一个元素
    println(q.head) //对队列本身没有任何影响

    // 返回队列最后一个元素
    println(q.last) //对队列本身没有任何影响

    // 返回队列的尾部
    // 即：返回除了第一个以外剩余的元素， 可以级联使用，这个在递归时使用较多。
    println(q.tail)
    println(q.tail.tail)

    // 添加元素
    println("add before = " + q)
    q.enqueue(5)
    println("add after = " + q)
    val i: Int = q.dequeue() // 队列先进先出
    println("i=" + i)
    // 删除元素
    println("delete after = " + q)
    q.dequeue()
    q.dequeue()
    q.dequeue()
    println("delete after = " + q)


  }
}
