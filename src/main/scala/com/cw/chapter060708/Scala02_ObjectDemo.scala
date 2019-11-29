package com.cw.chapter060708



object Scala02_ObjectDemo {
  def main(args: Array[String]): Unit = {

    // 创建类的对象
    val user: User = new User();

    // 调用对象的属性或方法
    user.username = "zhangsan"

    println(user.username)


    //val emp = new Emp()

  }
}

// 声明类
class User {

  // 类的主体内容 ==> 类体

  // 声明属性
  // 1) Scala中声明一个属性,必须显示的初始化，然后根据初始化数据的类型自动推断，属性类型可以省略(这点和Java不同)
  // 2) 如果赋值为null,则一定要加类型，因为不加类型, 那么该属性的类型就是Null类型.
  // 3) 如果在定义属性时，暂时不赋值，也可以使用符号_(下划线)，让系统分配默认值.
  var username: String = _
  var age: Int = _

  def login(): Boolean = {
    true
  }

}
