package com.cw.chapter060708


// Scala中的包声明方式默认和java是一致的,但是有其他的使用方式

// Scala包的三大作用(和Java一样)
//      1) 区分相同名字的类
//      2) 当类很多时,可以很好的管理类
//      3) 控制访问范围

// 命名规范：机构类型名.机构或公司名.项目名.业务模块名

// Scala会自动引入的常用包:java.lang.*  , scala包 ,Predef包



// 1) 在同一个源码文件中,可以多次声明package
//    声明的类在最后的那个包中 import com.cw.chapter060708.test.Emp
//    源码中的类所在的位置不需要和包路径相同

// 2) scala中所有的语法都可以进行嵌套(包里可以有包)
//    package可以使用大括号,大括号内声明的类在这个包中,之外声明的类不在这个包中

// 3) scala中可以声明父包和子包,父包中的类,子类可以直接访问,不需要引入,其实就是作用域的概念

// 4) scala中package可以声明类,但是无法声明变量和函数(方法)

// 5) scala为了弥补包的不足,使用了包对象package object的概念,其中可以声明属性和方法

// 6) 包名可以相对路径也可以绝对路径
//    在一般情况下：我们使用相对路径来引入包，只有当包名冲突时，使用绝对路径来处理。


package test {

  class Emp {

  }

  package object test{
    val test = "123"

    def test1() {
    }
  }

  // val test= "123"
  // def test1(){
  // }


  package test1 {

    object Scala03_Package {

      def main(args: Array[String]): Unit = {
        val emp = new Emp()
        println(emp)
      }
    }

  }

}



