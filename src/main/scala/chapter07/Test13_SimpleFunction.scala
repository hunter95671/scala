package chapter07

object Test13_SimpleFunction {

  def main(args: Array[String]): Unit = {

    val list = List(2, 3, 5, -3, 6)
    val list2 = List(("a", 2), ("b", 3), ("c", 5), ("d", -3), ("e", 6))

    //(1)、求和
    var sum = 0
    for (elem <- list) {
      sum += elem
    }
    println(sum)

    println(list.sum)

    //(2)、求乘积
    println(list.product)

    //(3)、最大值
    println(list.max)
    println(list2.maxBy((tuple: (String, Int)) => tuple._2))
    println(list2.maxBy(_._2))

    //(4)、最小值
    println(list.min)
    println(list2.minBy(_._2))

    //(5)、排序
    //5.1 sorted

    //从小到大
    val sortedList = list.sorted
    println(sortedList)

    //从大到小
    println(sortedList.reverse)
    //传入隐式参数
    println(list.sorted(Ordering[Int].reverse))

    //5.2 sortBy
    println(list2.sortBy(_._2))

    //5.3 sortWith
    println(list.sortWith((a: Int, b: Int) => { a < b }))
    println(list.sortWith(_ < _))
    println(list.sortWith(_ > _))
  }
}
