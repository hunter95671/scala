package chapter07

import scala.collection.mutable.ListBuffer

object Test05_ListBuffer {

  def main(args: Array[String]): Unit = {

    //1.创建可变列表
    val list1: ListBuffer[Int] = new ListBuffer[Int]()
    val list2 = ListBuffer(16, 17, 18)

    println(list1)
    println(list2)

    println("============")

    //2.添加元素
    list1.append(15, 66)
    list2.prepend(77, 88)
    list1.insert(1, 99, 98)

    println(list1)
    println(list2)

    println("============")

    32 +=: 33 +=: list1 += 25 += 63

    println(list1)

    println("============")

    //3.合并list
    val list3 = list1 ++ list2

    println(list3)
    println("============")

    list1 ++= list2

    println(list1)
    println(list2)
    println("============")

    //4.修改元素
    list2(3) = 30
    println(list2)
    println("============")

    //5.删除元素
    list2.remove(2)
    list2 -= 30
    println(list2)
    println("============")

  }
}
