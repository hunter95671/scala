package chapter04

object Test02_ForLoop {

  def main(args: Array[String]): Unit = {

    //java for语法 for(int i=0 ; i<10 ; i++)

    //1.范围遍历
    //1到10，包含10
    for (i <- 1 to 10) {
      println(i + ".hello world")
    }

    for (i: Int <- 1.to(10)) {
      println(i + ".hello world")
    }

    //1直到10，不包含10
    for (i <- 1 until 10) {
      println(i + ".hello world")
    }

    //2.集合遍历
    for (i <- Array(15, 16, 27)) {
      println(i)
    }

    for (i <- List(15, 16, 27)) {
      println(i)
    }

    for (i <- Set(15, 16, 27)) {
      println(i)
    }

    //3.循环守卫

    for (i <- 1 to 10) {
      if (i != 5) {
        println(i)
      }
    }

    for (i <- 1 to 10 if i != 5) {
      println(i)
    }

    //4.循环步长(步长不能为0)
    for (i <- 1 to 10 by 2) {
      println(i)
    }

    for (i <- 10 to 1 by -2) {
      println(i)
    }

    for (i <- 1 to 10 reverse) { //反转
      println(i)
    }

    for (i <- 1.0 to 10.0 by 0.5) { //使用double类型
      println(i)
    }

    //5.嵌套循环
    for (i <- 1 to 10 by 2) {
      for (j <- 1 to 10 by 2) {
        println("i=" + i + "," + "j=" + j)
      }
    }

    for (i <- 1 to 3; j <- 1 to 5) {
      println("i=" + i + "," + "j=" + j)
    }

    //6.循环引入变量
    for (i <- 1 to 10) {
      val j = 10 - i
      println("i=" + i + "," + "j=" + j)
    }

    for (i <- 1 to 10; j = 10 - i) {
      println("i=" + i + "," + "j=" + j)
    }

    //7.循环返回值
    var a=for (i <- 1 to 10 ) {
      println(i)
    }
    println("a="+a)

    var b=for (i <- 1 to 10 ) yield i
    println("b="+b)

  }
}
