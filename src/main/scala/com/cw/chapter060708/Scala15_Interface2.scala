package com.cw.chapter060708

object Scala15_Interface2 {
  def main(args: Array[String]): Unit = {
    new User15()
  }
}


// 特质和父类没有关系,只和当前混入的类有关系,所以,在调用时,父类先执行,然后当前混入的特质再执行,然后当前类再执行

// 如果父类混入了相同的特质,那么特质的代码只会执行一遍
trait TestTrait15 {
  println("trait code...")
}

class Person15 extends TestTrait15 {
  println("parent code...")
}

class User15 extends Person15 with TestTrait15 {
  println("child code...")
}