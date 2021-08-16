package chapter07

import scala.collection.mutable

object Test09_MutableMap {

  def main(args: Array[String]): Unit = {

    //1.创建map
    val map1: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2)
    println(map1)
    println("===========")

    //2.添加元素
    map1.put("c", 3)
    println(map1)
    println("===========")

    map1 += (("d", 4))
    println(map1)
    println("===========")

    //3.删除元素
    map1.remove("d")
    println(map1)
    println("===========")

    //4.修改元素
    map1.update("c", 30)
    println(map1)
    println("===========")

    //5.合并map
    val map2: mutable.Map[String, Int] = mutable.Map("d" -> 4, "e" -> 5)
    map1 ++= map2
    println(map1)
    println("===========")

    val map3 = map1 ++ map2
    println(map3)
    println("===========")
  }
}
