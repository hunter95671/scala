package chapter07

object Test06_ImmutableSet {

  def main(args: Array[String]): Unit = {

    //1.创建set
    val set1 = Set(11, 12, 13, 11)
    println(set1)
    println("==========")

    //2.添加元素
    val set2 = set1 + 20
    println(set2)
    println("==========")

    //3.合并set
    val set3 = Set(20, 21, 22, 23, 21)
    val set4 = set2 ++ set3

    println(set4)
    println("==========")

    //4.删除元素
    val set5=set3 - 22
    println(set5)
    println("==========")
  }
}
