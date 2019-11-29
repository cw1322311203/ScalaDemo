package com.cw.chapter060708

// 构造方法参数
/*
    class A{

      private String s;

      public A(String s){
        this.s=s
      }

    }

 */


object Scala12_Class2 {
  def main(args: Array[String]): Unit = {
    val user = new User12("123")
    println(user.name)
  }
}

// 类构造方法的参数的作用域默认为整个类的主体,但是如果想要参数作为属性来使用,可以采用特殊方式(在参数名前加var,val)来声明
class User12(var name: String) {

}