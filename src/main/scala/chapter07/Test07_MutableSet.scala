package chapter07

import scala.collection.mutable

object Test07_MutableSet {

  def main(args: Array[String]): Unit = {

    //1.创建集合
    val set1: mutable.Set[Int] = mutable.Set(11, 12, 13, 11)
    println(set1)
    println("==========")

    //2.添加元素
    val set2=set1 + 88
    println(set2)
    println("==========")

    set1 += 88
    println(set1)
    println("==========")

    val flag1 = set1.add(66)
    println(flag1)   //true
    println(set1)
    println("==========")
    val flag2 = set1.add(66)
    println(flag2)   //false
    println(set1)
    println("==========")

    //3.删除元素
    set1 -= 88
    println(set1)
    println("==========")

    val flag3 = set1.remove(66)
    println(flag1)   //true
    println(set1)
    println("==========")
    val flag4 = set1.remove(66)
    println(flag2)   //false
    println(set1)
    println("==========")

    //4.合并两个set
    val set3: mutable.Set[Int] = mutable.Set(88,66,99)
    println(set1)
    println(set3)

  }
}
