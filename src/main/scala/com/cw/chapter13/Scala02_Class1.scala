package com.cw.chapter13

object Scala02_Class1 {
  def main(args: Array[String]): Unit = {

    // List<User1> list=new ArrayList<User1>();

    // 默认情况下,scala中的泛型和java一样,不变
    // 在scala中,为了丰富泛型的功能.提供了协变(+),逆变(-)的类型操作

    // 协变
    val test: Test[User1] = new Test[Child1]
    println(test)
    // 逆变
    val test1: Test1[User1] = new Test1[Person1]
    println(test1)




    // Scala的协变(+)，逆变(-)，协变covariant、逆变contravariant、不可变invariant
    // 对于一个带类型参数的类型，比如 C[T]，如果对A及其子类型B，满足C[B]也符合 C[A]的子类型，那么就称为covariance(协变) ，
    // 如果 C[A]是 C[B]的子类型，即与原来的父子关系正相反，则称为contravariance(逆变)。
    // 如果一个类型支持协变或逆变，则称这个类型为variance(翻译为可变的或变型)，否则称为invariance(不可变的)

    // C[+T]：如果A是B的子类，那么C[A]是C[B]的子类，称为协变 
    // C[-T]：如果A是B的子类，那么C[B]是C[A]的子类，称为逆变
    // C[T]：无论A和B是什么关系，C[A]和C[B]没有从属关系。称为不变.

    // 在Java里，泛型类型都是invariant，比如 List<String> 并不是 List<Object> 的子类型。
    // 而scala支持，可以在定义类型时声明(用加号表示为协变，减号表示逆变)，
    // 如: trait List[+T] // 在类型定义时声明为协变这样会把List[String]作为List[Any]的子类型。


  }
}

class Person1 {

}

class User1 extends Person1 {

}

class Child1 extends User1 {

}

class Test[+User1] {

}

class Test1[-User1] {

}
