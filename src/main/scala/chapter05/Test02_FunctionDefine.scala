package chapter05

object Test02_FunctionDefine {

  def main(args: Array[String]): Unit = {

    //(1)、函数 1：无参，无返回值
    def f1(): Unit = {
      println("1.无参，无返回值")
    }

    f1()
    println(f1())
    println("==================")

    //(2)、函数 2：无参，有返回值
    def f2(): Int = {
      println("2.无参，有返回值")
      return 2
    }

    f2()
    println(f2())
    println("==================")

    //(3)、函数 3：有参，无返回值
    def f3(name: String): Unit = {
      println("3.有参，无返回值" + name)
    }

    f3("tom")
    println(f3("tom"))
    println("==================")

    //(4)、函数 4：有参，有返回值
    def f4(name: String): String = {
      println("4.有参，有返回值" + name)
      return "hi," + name
    }

    f4("tom")
    println(f4("tom"))
    println("==================")

    //(5)、函数 5：多参，无返回值
    def f5(name1: String, name2: String): Unit = {
      println("5.多参，无返回值" + name1 + " and " + name2)
    }

    f5("tom", "jerry")
    println(f5("tom", "jerry"))
    println("==================")

    //(6)、函数 6：多参，有返回值
    def f6(a: Int, b: Int): Int = {
      println("6.多参，有返回值")
      return a + b
    }

    f6(2, 5)
    println(f6(2, 5))
    println("==================")

  }
}
