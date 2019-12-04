package com.cw.chapter11

object Scala02_Underline {
  def main(args: Array[String]): Unit = {
    // TODO 下划线用法
    // 1.模式匹配的其他场合
    // 2.系统给变量赋初始值
    // 3.可以类似为java导包的星号
    // 4.可以给类起别名
    // 5.隐藏类
    // 6.代替方法的参数
    // 7.可以让函数不执行

    // 变成List(1,2,3,4)
    val list = List(List(1, 2), List(3, 4))

    def test(list: List[Int]): List[Int] = {
      list
    }

    val flatList: List[Int] = list.flatMap(x => x)
    // 以下下滑线用法可能太多,推断不出来
    //val intsToOnceToList: (List[Int] => GenTraversableOnce[Nothing]) => List[Nothing] = list.flatMap(_)
    println(flatList)

    val list2: List[String] = List("Hello Scala", "Hello World")
    // 变成List("Hello","Scala","Hello","World")
    // val wordList: List[String] = list2.flatMap(string => string.split(" "))
    val wordList: List[String] = list2.flatMap(_.split(" "))
    println(wordList)
  }
}
