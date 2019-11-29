package com.cw.chapter05

object Scala03_Function2 {
  def main(args: Array[String]): Unit = {

    // TODO scala可以采用自动推断功能来简化函数的声明
    // 至简

    // TODO 如果函数声明时,明确无返回值(声明Unit),那么函数体中即使使用return关键字也不会有返回值
    // 将函数的返回类型为Unit的函数称之为 TODO 过程(procedure)
    // 如果明确函数没有返回值，那么等号可以省略
    /*
    def test(): Unit = {
      //println("Hello Scala")
      return "zhangsan"
    }
    */

    // TODO 如果将函数体的最后一行代码进行返回,那么return关键字可以省略
    // 如果没有return ,默认以执行到最后一行的结果作为返回值
    // 如果函数明确使用return关键字，那么函数返回就不能使用自行推断了
    // 这时要明确写成 : 返回类型 =  , 当然如果你什么都不写，即使有return 返回值为()
    /*
    def test(): String = {
      //return "zhangsan"
      "zhangsan"
      // println("xxxx")
    }
    */

    // TODO 如果可以根据函数的最后一行代码推断类型,那么函数返回值类型可以省略
    /*
     def test() = {
       "zhangsan"
     }
     */

    // TODO 如果函数体中只有一行代码,大括号可以省略
    //    def test() = "zhangsan"


    // TODO 如果函数声明中没有参数列表,小括号可以省略
    // 如果函数小括号省略,那么访问函数时不能增加小括号
    // TODO  声明函数必须要增加def
    // def test = "zhangsan"
    // val test1 = "lisi"

    // println(test)


    // TODO 如果明确函数没有返回值(声明Unit),那么等号可以省略,省略后,编译器不会将函数体最后一行代码作为返回值
    // 如果函数没有参数列表,可以省略小括号,调用时一定不能使用小括号
    // 如果函数没有参数列表,但是没有省略小括号,调用时小括号可加可不加

    /*
    def test {
      "zhangsan"
    }

    println(test) // ()
    */

    //def username = 1
    //println(username)


    // TODO 如果明确函数无返回值或不确定返回值类型，那么返回值类型可以省略(或声明为Any)

    def f4(s: String): Any = {
      if (s.length >= 3)
        s + "123"
      else
        3
    }



    // TODO 匿名函数
    () -> {
      println("xxxxx")
    }
    val f: () => Unit = () => {}
    f()

  }
}
