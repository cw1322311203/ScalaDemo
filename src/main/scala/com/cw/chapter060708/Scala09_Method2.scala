package com.cw.chapter060708

// 构造方法
/*
  java中的构造方法
  class User{

    private String username;

    //public User(){
    //}

    // 一旦自定义了构造方法,那么就不会提供默认的构造方法了
    public User(String name){
      this(name,"xxxxx");
    }
    public User(String name,String password){
      this.username=name;
    }
  }

  //User user=new User();

  User user1=new User("zhangsan");

 */
object Scala09_Method2 {
  def main(args: Array[String]): Unit = {
    //创建对象
    //val user = new User09("zhangsan")
    val user = new User09()
    //println(user)
  }
}

// TODO Scala中的构造方法分为两类: 主构造方法(一个) & 辅助构造方法(多个)
// Scala构建对象可以通过辅助构造方法创建,但是 TODO 必须要调用主构造方法
// Scala是完全面向函数的语言,所以类也是函数
// 类是函数,可以使用小括号作为函数的参数列表
// 类所代表的函数其实就是这个类的构造方法
// 默认情况下,scala也是给类提供无参构造方法,所以小括号可以省略
// 在类的后面声明的构造方法就是主构造方法
// 在主构造方法中声明的构造方法就是辅助构造方法
// 辅助构造器的声明不能和主构造器的声明一致,会发生错误(构造器名重复)

// 如果想让主构造器变成私有的,可以在()之前加上private,这样用户不能直接通过主构造器来构造对象了(可以通过伴生对象访问)

class User09 private(s: String) { // 主构造方法,如果主构造方法无参数,小括号可以省略

  // 类体 & 构造方法体
  println("主构造方法")
  println(s)

  // 辅助构造方法无论是直接或者间接,最终都一定要调用主构造器,执行主构造器的逻辑
  // 而且需要放在辅助构造器的第一行
  def this(s: String, ss: String) { // 辅助构造方法
    this(s) // 直接调用主构造器
    println("辅助构造方法2")
  }

  // 声明辅助构造方法,方法名为this
  // TODO 构造方法调用其他的构造方法时,应该保证被调用的构造方法已经声明过
  def this() { // 辅助构造方法可以有多个
    this("辅助构造方法1", "xxxx") // 间接调用主构造器,因为def this(s: String, ss: String)中调用了主构造器
  }


}
