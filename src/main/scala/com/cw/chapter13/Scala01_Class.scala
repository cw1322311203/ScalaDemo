package com.cw.chapter13

object Scala01_Class {
  def main(args: Array[String]): Unit = {
    test(new Child)
  }

  // <: 表示泛型的上限,所以传递数据时,应该为子类或当前类
  // >: 表示泛型的下限,和java不太一样,所以传递数据时,什么都可以传递,类型于 [T]
  // >: 对于下界，可以传入任意类型

  def test[T >: User](t: T): Unit = {
    println(t)
  }


}

class Person {

}

class User extends Person {

}

class Child extends User {

}
