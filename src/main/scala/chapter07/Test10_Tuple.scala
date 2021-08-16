package chapter07

object Test10_Tuple {

  def main(args: Array[String]): Unit = {

    //1.创建元组
    val tuple: (String, Boolean, Int, Char) = ("hello", true, 18, 'b')
    println(tuple)

    //2.访问数据
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
    println(tuple._4)

    println(tuple.productElement(1))
    println("===============")

    //3.遍历元组数据
    for (elem <- tuple.productIterator) {
      println(elem)
    }

    //4.嵌套
    val mulTuple = ("tom", 22, (3.6, 3.8, 3.0))
    println(mulTuple._3._1)

  }
}
