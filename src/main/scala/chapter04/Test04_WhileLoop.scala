package chapter04

object Test04_WhileLoop {

  def main(args: Array[String]): Unit = {

    var i = 0
    while (i < 10) {
      println("ok:" + i)
      i += 1
    }

    do {
      println("ok:" + i)
      i += 1
    } while (i < 10)

  }
}
