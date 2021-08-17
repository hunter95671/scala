package chapter07

object Test12_DerivedCollection {

  def main(args: Array[String]): Unit = {

    val list1 = List(1, 2, 3, 55, 66)
    val list2 = List(1, 2, 3, 77, 88)

    //(1)、获取集合的头
    println(list1.head)

    //(2)、获取集合的尾（不是头的就是尾）掐头
    println(list1.tail)

    //(3)、集合最后一个数据
    println(list2.last)

    //(4)、集合初始数据（不包含最后一个）
    println(list2.init)

    //(5)、反转
    println(list1.reverse)

    //(6)、取前（后）n 个元素
    println(list1.take(3))
    println(list1.takeRight(2))

    //(7)、去掉前（后）n 个元素
    println(list2.drop(3))
    println(list2.dropRight(2))

    //(8)、并集
    val union = list1.union(list2)
    println(union)

    //如果set并集的话会去重
    val set1 = Set(1, 2, 3, 55, 66)
    val set2 = Set(1, 2, 3, 77, 88)
    val union2 = set1.union(set2)
    println(union2)

    //(9)、交集
    val intersection = list1.intersect(list2)
    println(intersection)

    //(10)、差集
    val diff1 = list1.diff(list2)
    val diff2 = list2.diff(list1)
    println(diff1)
    println(diff2)

    //(11)、拉链
    println(list1.zip(list2))
    println(list2.zip(list1))

    //(12)、滑窗
    for(elem<-list1.sliding(2)){
      println(elem)
    }
    println("===========")
    for(elem<-list1.sliding(2,2)){
      println(elem)
    }

  }
}
