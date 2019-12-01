package com.cw.chapter09

/*
  在scala2.10后提供了隐式类，可以使用implicit声明类，隐式类的非常强大，同样可以扩展类的功能，
  比前面使用隐式转换丰富类库功能更加的方便，在集合中隐式类会发挥重要的作用。
 */
object Scala04_Transform3 {

  // 隐式类使用有如下几个特点：
  // 1) 其所带的构造参数有且只能有一个
  // 2) 隐式类必须被定义在“类”或“伴生对象”或“包对象”里，即隐式类不能是 顶级的(top-level  objects)。
  // 3) 隐式类不能是case class（case class在后续介绍 样例类）
  // 4) 作用域内不能有与之相同名称的标识符
  def main(args: Array[String]): Unit = {

    val user4 = new User4()
    user4.insert()
    user4.delete()
  }

  implicit class Person4(u: User4) {
    def delete() {

    }
  }

  class User4 {
    def insert() {

    }
  }

}

