package com.cw.chapter05

object Scala05_FunctionHell {
  def main(args: Array[String]): Unit = {
    // 函数式编程 - 地狱

    // TODO Scala是完全面向函数式编程的语言

    // 函数在Scala中可以做任何事情
    // 函数可以赋值给变量
    // 函数可以作为函数的参数
    // 函数可以作为函数的返回值


    def f(): Unit = {
      println("function")
    }

    def f0() = {
      //返回函数
      // 直接返回函数,有问题,需要增加特殊符号:下划线 _
      f _
    }

    f0()()
    //val ffff: () => Unit = f0()
    //ffff()


    /*
    def ff(i: Int): Unit = {
      println(i)
    }

    def fff() = {
      // ff(3) //不写下划线就需要传入参数,返回的是函数结果
      ff _ //写下划线就表示调用的是ff这个函数本身
    }

    fff()(3)
    */


    /*
    //函数里面调函数
    def f1(i: Int) = {

      def f2(j: Int): Int = {
        i * j
      }

      f2 _
    }

    println(f1(2)(3)) //6
    */

    // TODO 函数柯里化
    /*
        柯里化指的是将原来接受多个参数的函数变成新的接受一个参数的函数的过程,新函数的参数接受原来的第二个参数为唯一参数,
        如果有n个参数, 就是把这个函数分解成n个新函数的过程
     */
    // 1) 函数编程中，接受多个参数的函数都可以转化为接受单个参数的函数，这个转化过程就叫柯里化
    // 2) 柯里化就是证明了函数只需要一个参数而已。其实我们刚才的学习过程中，已经涉及到了柯里化操作。
    // 3) 不用设立柯里化存在的意义这样的命题。柯里化就是以函数为主体这种思想发展的必然产生的结果。(即：柯里化是面向函数思想的必然产生结果)
    // 传统方式, 函数/方法(变量)， 对象.方法(变量)
    // 集合.函数(函数).函数(函数).函数(函数)

    /*
    def f3(i: Int)(j: Int): Int = {
      i * j
    }

    println(f3(2)(3))

     // 原始函数, 有3个参数的函数
     def addMulti(a: Int, b: Int, c: Int) = (a + b) * c

      // 函数A的返回值是一个函数B, 函数B的返回值是函数C
      def addMulti(a: Int) = {
        (b: Int) => (c: Int) => (a + b) * c
      }
      println(addMulti(50)(80)(20))

    */


    // TODO 闭包
    // 一个函数在实现逻辑时,将外部的变量引入到函数的内容,改变了这个变量的生命周期,称之为闭包

    /*
    def f1(i: Int) = {

      def f2(j: Int): Int = {
        i * j
      }

      f2 _
    }

    // 以下语句表示f1是一个入口参数是Int,返回值类型是Int的函数     (Int) => Int
    val intToInt: (Int) => Int = f1(10)

    def minusxy(x: Int) = (y: Int) => x – y
    //minusxy 他会返回一个匿名函数 (y: Int) => x – y
    //匿名函数，他使用了一个外部的变量 x
    //f函数就是闭包.
    val f = minusxy(20)
    println("f(1)=" + f(1))
    println("f(2)=" + f(2))


    */

    // TODO 将函数作为参数传递给另外一个函数,需要采用特殊的声明方式
    // ()=>Unit
    // 参数列表=>返回值类型
    /*
    def f4(f: () => Int): Int = {
      f() + 10
    }

    def f5(): Int = {
      5
    }

    println(f4(f5)) // 15

    // 1) map(plus(_)) 中的plus(_) 就是将plus这个函数当做一个参数传给了map，_这里代表从集合中遍历出来的一个元素。
    // 2) plus(_) 这里也可以写成 plus 表示对 Array(1,2,3,4) 遍历，将每次遍历的元素传给plus的 x
    // 3) 进行 3 + x 运算后，返回新的Int ，并加入到新的集合 result1中
    // 4) def map[B, That](f: A => B) 的声明中的 f: A => B 一个函数
    def plus(x: Int) = 3 + x

    val result1 = Array(1, 2, 3, 4).map(plus(_))
    println(result1.mkString(","))

    */

    // TODO 使用匿名函数改善代码

    /*

    def f6(f: () => Unit): Unit = {
      f()
    }

    f6(() => {
      println("xxxx")
    })
    */

    def f7(f: (Int) => Unit): Unit = {
      f(10)
    }

    //    def f8(i: Int): Unit = {
    //      println(i)
    //    }

    //    f7(f8)
    //    f7((i: Int) => {
    //      println(i)
    //    })
    //
    //    f7((i) => {
    //      println(i)
    //    })
    //    f7((i) => println(i))
    // 当传入的函数，只有单个参数时，可以省去括号
    //    f7(i => println(i))
    // 如果变量只在=>右边只出现一次，可以用_来代替
    //    f7(println(_))
    //    f7(println)

    def f8(f: (Int, Int) => Int): Int = {
      f(10, 10)
    }

    //    def f9(i: Int, j: Int): Int = {
    //      i + j
    //    }

    //    println(f8(f9))

    println(f8((x: Int, y: Int) => {
      x + y
    }))
    println(f8((x, y) => {
      x + y
    }))
    println(f8((x, y) =>
      x + y
    ))
    // TODO 如果变量只在=>右边只出现一次，可以用_来代替
    println(f8(_ + _))


  }
}
