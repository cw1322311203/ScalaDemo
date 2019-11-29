package com.cw.chapter01

//打印字符串
object Scala02_StringPrint {
  def main(args: Array[String]): Unit = {
    //打印字符串
    val name = "ApacheCN"
    val age = 1
    val url = "www.cw.com"

    //字符串通过+号连接（类似java）
    println("name=" + name + " age=" + age + " url=" + url)

    //printf用法 （类似C语言）字符串通过 % 传值。
    printf("name=%s, age=%d, url=%s \n", name, age, url)

    //插值字符串:字符串通过$引用
    println(s"name=${name}, age=$age, url=$url")
    println(f"name=${name}, age=${age}%.2f, url=$url")
    print(raw"name=${name}, age=${age}%.2f, url=$url \n")

    //单行注释
    /*
      多行注释
     */
    /**
      * doc注释
      */
  }
}
