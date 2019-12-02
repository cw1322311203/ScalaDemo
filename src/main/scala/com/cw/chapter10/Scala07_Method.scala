package com.cw.chapter10

object Scala07_Method {
  def main(args: Array[String]): Unit = {

    // TODO 集合常用的方法
    val list = List(1, 2, 4, 3, 1, 3)


    // TODO 求和
    println("sum = " + list.sum)
    // TODO 最大值
    println("max = " + list.max)
    // TODO 最小值
    println("min = " + list.min)
    // TODO 乘积
    println("product = " + list.product)

    // TODO 反转(无排序)
    println("reverse = " + list.reverse)

    // TODO 分组
    // TODO groupBy(通过制定函数的返回值进行分组)
    // 使用数字当分组标志
    val intToInts: Map[Int, List[Int]] = list.groupBy(x => x)
    intToInts.foreach(t => {
      println(t._1 + "=" + t._2)
    })

    // 通过奇偶分组
    val booleanToInts: Map[Int, List[Int]] = list.groupBy(i => i % 2)
    booleanToInts.foreach(t => {
      println(t._1 + "=" + t._2)
    })

    // 使用字符串首字母当分组标志
    val stringList = List("11", "12", "22", "23")
    val stringToStrings: Map[String, List[String]] = stringList.groupBy(s => {
      s.substring(0, 1)
    })
    stringToStrings.foreach(t => {
      println(t._1 + "=" + t._2)
    })

    // TODO 排序(按照制定规则进行排序)
    // TODO sortBy(根据返回值排序)
    val sortList: List[Int] = list.sortBy(x => x)
    println(sortList.mkString(","))

    val strings: List[String] = List("11", "23", "14", "22")
    val sortList2: List[String] = strings.sortBy(x => x.substring(1))
    println(sortList2.mkString(","))

    // TODO sortWith(制定排序方式)
    // 升序 小 => 大
    val ints: List[Int] = list.sortWith((x, y) => {
      x < y
    })
    println(ints.mkString(","))
    // 降序 大 => 小
    val ints1: List[Int] = list.sortWith((x, y) => {
      x > y
    })
    println(ints1.mkString(","))

    val sortList3: List[String] = strings.sortWith((left, right) => {
      left.substring(1).toInt > right.substring(1).toInt
    })
    println(sortList3.mkString(","))

    // TODO 获取集合的前n个 take
    println(sortList3.take(3))


    // TODO 迭代iterator
    // 每个集合都有迭代器,进行循环遍历
    //    for (elem <- list.iterator) {
    //      println(elem)
    //    }

    // TODO 映射(转换)map
    // 将制定数据结构转换为其他数据结构
    // 将集合中元素映射为元祖 x=>(x,x)
    val mapList: List[(Int, Int)] = list.map(x => (x, 1))
    println(mapList.mkString(","))
    val intToTuples: Map[Int, List[(Int, Int)]] = mapList.groupBy(t => t._1)
    println(intToTuples.mkString(","))
    // (k,list) => (k,size)
    val intToInt: Map[Int, Int] = intToTuples.map(x => (x._1, x._2.size))
    println(intToInt.mkString(","))


    // TODO WordCount
    // 对集合中的单词字符串进行统计出现的次数,并且按照出现次数降序排列,取前三名
    val wordList = List("Hello", "Scala", "Hello", "World", "Hbase", "Hadoop", "Kafka", "Scala", "World")
    // 1.将相同的单词放置在一起(分组)
    val wordToList: Map[String, List[String]] = wordList.groupBy(word => word)
    // 2.将数据结构进行转换
    val wordToCountMap: Map[String, Int] = wordToList.map(t => {
      (t._1, t._2.size)
    })
    // 3.将数据进行排序(降序)
    // map无序,需要转成list
    // List((k1,v1),(k2,v2))
    val sortWordList = wordToCountMap.toList.sortWith((left, right) => {
      left._2 > right._2
    })
    // 4.取排序完成后的前3条数据
    val resultList: List[(String, Int)] = sortWordList.take(3)
    println(resultList.mkString(","))

    // TODO 扁平化操作
    val lineList = List("Hello World", "Hello Scala", "Hello Hadoop")

    val flatMapList: List[String] = lineList.flatMap(x => x.split(" "))

    val resultList1: List[(String, Int)] = flatMapList.groupBy(word => word).map(t => (t._1, t._2.size)).toList.sortWith((left, right) => {
      left._2 > right._2
    })
    println(resultList1.mkString(","))




    /*
    list.reduce()
    list.fold()
    list.filter()
    */


  }
}
