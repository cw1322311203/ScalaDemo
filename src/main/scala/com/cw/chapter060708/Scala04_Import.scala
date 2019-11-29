package com.cw.chapter060708

// import用于导入类
// import可以在任意的地方使用
// 在Scala中，import语句可以出现在任何地方，并不仅限于文件顶部，import语句的作用一直延伸到包含该语句的块末尾。
// 这种语法的好处是：在需要时在引入包，缩小import 包的作用范围，提高效率。

// import可以导入一个包中的所有的类,采用下划线_代替星号*
// import java.util._

// import 导入相同包中的多个类,采用大括号进行包含处理
// import java.util.{ArrayList, List, Date}

// import java.util.{Date => _}
// import 可以采用特殊的方式来隐藏指定的类: {类名=>_}
// import java.sql.Date
// import 可以导包,使用时用new util.Date()

// scala可以在导入类的时候给类起别名

// 因为Scala语言源自于Java，所以java.lang包中的类会自动引入到当前环境中，
// 而Scala中的scala包和Predef包的类也会自动引入到当前环境中，即起其下面的类可以直接使用。
import java.util.{HashMap=>JavaHashMap}



object Scala04_Import {
  def main(args: Array[String]): Unit = {
    // import java.util.Date
    //val date = new Date()
    //println(date)
//    new util.Date()
    new JavaHashMap()
  }
}
