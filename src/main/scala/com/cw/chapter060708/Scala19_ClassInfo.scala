package com.cw.chapter060708

object Scala19_ClassInfo {
  def main(args: Array[String]): Unit = {

    // TODO scala如果想要获取类的信息,需要采用特殊的方法 : classOf[类型]
    // classOf能直接使用,是因为scala.Predef伴生对象时默认导入到当前开发环境中的
    val userClass: Class[User19] = classOf[User19]

    userClass.getInterfaces

    // TODO 可以使用type关键字给类起别名
    type XXXX = User19
    val xxxx = new XXXX()

    val user = new User19

    // 判断类型
    val bool: Boolean = user.isInstanceOf[User19]
    if (bool) {
      // 转换类型
      val user1: User19 = bool.asInstanceOf[User19]
    }

  }
}

class User19 {

}
