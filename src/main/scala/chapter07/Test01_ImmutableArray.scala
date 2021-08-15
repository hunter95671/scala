package chapter07

object Test01_ImmutableArray {

  def main(args: Array[String]): Unit = {

    //1.创建数组
    val arr = new Array[Int](5)

    //另一种创建方式
    val arr2 = Array(12, 13, 14, 15, 16, 17)

    //2.访问数组中元素
    println(arr(0))
    println(arr(1))
    println(arr(2))
    println(arr(3))
    println(arr(4))

    arr(0) = 21
    arr(1) = 22
    arr(2) = 23
    println(arr(0))
    println(arr(1))
    println(arr(2))

    println("=====================")

    //3.数组的遍历
    //(1)、普通for循环
    for (i <- 0 until (arr.length)) {
      println(arr(i))
    }
    println("=====================")
    for (i <- arr.indices) {
      println(arr(i))
    }
    println("=====================")
    //(2)、遍历所有元素，增强for循环
    for (elem <- arr2) {
      println(elem)
    }
    println("=====================")

    //(3)、迭代器使用
    val iter = arr.iterator

    while (iter.hasNext) {
      println(iter.next())
    }
    println("=====================")

    //(4)、调用foreach方法
    arr2.foreach((elem: Int) => println(elem))
    println("=====================")

    arr2.foreach(println)
    println("=====================")

    //(5)、按照指定的分隔符连接成一个字符串
    println((arr2.mkString("-")))
    println("=====================")

    //4.添加元素

    //添加在最后
    val newArr = arr2.:+(56)
    println((newArr.mkString("-")))

    //添加在最前
    val newArr2 = newArr.+:(88)
    println((newArr2.mkString("-")))
    println("=====================")

    //简写
    val newArr3 = newArr2 :+ 15
    val newArr4 = 19 +: 50 +: newArr3 :+ 55
    println((newArr4.mkString(",")))


  }
}
