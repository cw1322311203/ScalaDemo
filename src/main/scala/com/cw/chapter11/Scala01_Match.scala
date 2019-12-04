package com.cw.chapter11

import scala.collection.GenTraversableOnce

object Scala01_Match {
  def main(args: Array[String]): Unit = {
    // 模式匹配，类似于Java的switch语法
    /*
      模式匹配语法中，采用match关键字声明，每个分支采用case关键字进行声明，
      当需要匹配时，会从第一个case分支开始，如果匹配成功，那么执行对应的逻辑代码，
      如果匹配不成功，继续执行下一个分支进行判断。
      如果所有case都不匹配，那么会执行case _ 分支，类似于Java中default语句。
     */

    // TODO match的细节和注意事项
    //  1) 如果所有case都不匹配，那么执行case _ 分支，类似于Java中default语句
    //  2) 如果所有case都不匹配，又没有写case _ 分支，那么会抛出MatchError
    //  3) 每个case中，不用break语句，自动中断case
    //  4) 可以在match中使用其它类型，而不仅仅是字符,可以是表达式
    //  5) => 类似于 java swtich 的 :
    //  6) => 后面的代码块到下一个case, 是作为一个整体执行，可以使用{} 括起来，也可以不括。

    val oper = '*'
    val n1 = 20
    val n2 = 10
    var res = 0
    oper match {
      case '+' => res = n1 + n2
      case '-' => res = n1 - n2
      case '*' => res = n1 * n2
      case '/' => res = n1 / n2
      case _ => println("oper error")
    }
    println("res=" + res)

  }
}
