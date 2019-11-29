package com.cw.chapter060708

// 父类构造方法

/*
  class A{
    public A(String s){

    }
  }

  class B extends A{
     public B(){
        //super();
        super("xxxxx");
     }
  }

 */
object Scala11_Class1 {
  def main(args: Array[String]): Unit = {
    val user = new User11()
  }
}

class Person11(s: String) {
  println("Person 主构造方法 = " + s)
}

// 如果父类主构造方法有参数,那么构建对象时必须显式的传递参数
// 可以在继承的父类后面增加小括号,传递参数,等同于调用父类的构造方法
class User11(s: String) extends Person11(s) {
  println("User 主构造方法")

  def this() {
    this("XXXXX")
    println("User 辅助构造方法")
  }
}