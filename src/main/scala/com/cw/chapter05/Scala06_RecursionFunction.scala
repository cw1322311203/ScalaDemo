package com.cw.chapter05

object Scala06_RecursionFunction {
  def main(args: Array[String]): Unit = {

    // 递归
    // 1) 函数的逻辑代码调用自身
    // 2) 函数在调用自身时,传递的参数应该有规律
    // 3) 函数应该有跳出递归的逻辑,否则会出现死循环
    // 4) 递归函数无法推断出函数的返回值类型,所以在使用时 TODO 必须有明确的返回值类型

    // 阶乘 = 一个大于1的数的阶乘 = 这个数 * (数-1)阶乘

    def !!(i: Int): Int = {
      if (i == 1) {
        1  // Int
      } else {
        i * !!(i - 1)  // ???
      }
    }

    // 5*4*3*2*1=6
    println(!!(5))

  }


}
