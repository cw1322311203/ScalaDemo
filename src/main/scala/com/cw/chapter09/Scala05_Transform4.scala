package com.cw.chapter09

import com.cw.chapter09.Scala05_Transform4.User4

/*
  隐式解析机制
  1) 首先会在当前代码作用域下查找隐式实体（隐式方法、隐式类、隐式对象）。
  2) 如果第一条规则查找隐式实体失败，会继续在隐式参数的类型的作用域里查找。类型的作用域是指与该类型相关联的全部伴生模块，
     一个隐式实体的类型T它的查找范围如下(第二种情况范围广且复杂在使用时，应当尽量避免出现)：
     a.如果T被定义为T with A with B with C,那么A,B,C都是T的部分，在T的隐式解析过程中，它们的伴生对象都会被搜索。
     b.如果T是参数化类型，那么类型参数和与类型参数相关联的部分都算作T的部分，
       比如List[String]的隐式搜索会搜索List的伴生对象和String的伴生对象。
     c.如果T是一个单例类型p.T，即T是属于某个p对象内，那么这个p对象也会被搜索。
     d.如果T是个类型注入S#T，那么S和T都会被搜索。
 */
object Scala05_Transform4 {
  def main(args: Array[String]): Unit = {

    val user4 = new User4()
    user4.insert()
    user4.delete()
  }


  class User4 extends Test {
    def insert() {
      println("insert...")
    }
  }

}

trait Test {

}

object Test {

  implicit class Person4(u: User4) {
    def delete() {
      println("delete...")
    }
  }

}

