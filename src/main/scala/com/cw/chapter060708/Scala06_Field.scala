package com.cw.chapter060708

import scala.beans.BeanProperty

// 类的属性
object Scala06_Field {
  def main(args: Array[String]): Unit = {

    val user = new User06
    println(user.username)

    user.username = "zhangsan"

    //user.setAddress()
    user.getAddress
  }
}

// TODO Scala中也有四种访问权限
// 1) public 2) protected 3) default(package)  4) private
// public是默认的访问权限,没有关键字
// protected 访问权限只能子类访问,同包访问不了
// private 私有访问权限,只能当前类访问,  只在类的内部和伴生对象中可用
// 包访问权限需要采用特殊的语法规则  : private[包名]
// 增加包访问权限后，1.private同时起作用。不仅同类可以使用 2.同时同一个包下其他类也可以使用

// scala设计者将访问的方式分成三大类(1) 处处可以访问public (2) 子类和伴生对象能访问protected (3) 本类和伴生对象访问 private

package p1 {
  package p2 {

    class UserP2 {
      var username = "zhangsan"
      private var password = "123123" // 当前类UserP2能访问
      protected var email = "@xx.com" // 子类能访问
      // private[p2] var address = "xxxxx" // 当前包p2能访问
      //private[p3] var address = "xxxxx" // 当前包p3能访问
    }

  }

  package p3 {

    import com.cw.chapter060708.p1.p2.UserP2

    class EmpP3 {
      def test(): Unit = {
        val user = new UserP2
        // user.username
        // user.address
      }
    }

  }

}

class User06 {

  // 声明属性
  // scala中类声明属性,默认为私有的,但是底层提供了公共的setter和getter方法
  // 当属性访问权限为默认时，从底层看属性是private的，但是因为提供了xxx_$eq()[类似setter]/xxx()[类似getter] 方法，
  // 因此从使用效果看是任何地方都可以访问)
  var username: String = _

  // 如果给属性增加private修饰符,那么属性无法在外部访问,因为底层生成的setter和getter方法都是私有的
  private var age: Int = _

  // 如果声明的属性使用val,那么属性是私有的,并且使用final修饰,底层只提供getter方法,而没有setter方法
  val email: String = ""

  // 为了和java bean规范统一,scala提供了注解,生成java中对应set,get方法
  // 将Scala字段加@BeanProperty时,这样会自动生成规范的setXxx/getXxx方法,这时可以使用对象.setXxx()和对象.getXxx()来调用属性
  @BeanProperty var address: String = _

}
