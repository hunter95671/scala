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


  }
}
