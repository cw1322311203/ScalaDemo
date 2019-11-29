package com.cw.chapter01

object Scala01_HelloWorld {

  // Scala源码中包含了main方法,在编译后自动形成了public static void main
  // scala在编译源码时,会生成两个字节码文件,静态main方法执行另一个字节码文件中的成员main方法
  // Scala是完全面向对象的语言,那么没有静态的方法,只能通过模拟生成静态方法
  // 编译时将当前类生成一个特殊的类==>Scala01_HelloWorld$,然后创建对象来调用这个对象的main方法

  // 一般情况下,将加$的类的对象,称之为"伴生对象"
  // 伴生对象中的内容,都可以通过类名访问,来模拟java中的静态语法

  // TODO 伴生对象的语法规则:使用object声明[加上就一定能够使用类名来访问]

  // public static void main(String [] arrays){方法体}

  // scala中没有public关键字,默认所有的访问权限都是公共的

  // scala中没有void关键字,采用特殊的对象模拟:Unit

  // scala中声明方法采用关键字def

  // 方法后面的小括号是方法的参数列表

  // scala中参数列表的声明方式和java不一样

  // java: String 参数名
  // scala: 参数名 : 类型

  // java中方法的声明和方法体直接连接
  // scala中方法的声明和方法体是通过等号连接的

  // scala中将方法的返回值类型放置在方法声明的后面,使用冒号连接

  // Scala方法由一条条语句构成，每个语句后不需要分号(Scala语言会在每行后自动加分号)，这也体现出Scala的简洁性。
  // 如果在同一行有多条语句，除了最后一条语句不需要分号，其它语句需要分号

  def main(args: Array[String]): Unit = {
    println("Hello World!")
  }
}
