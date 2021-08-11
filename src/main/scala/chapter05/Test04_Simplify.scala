package chapter05

//函数至简原则
object Test04_Simplify {

  def main(args: Array[String]): Unit = {

    def f0(name: String): String = {
      return name
    }

    println(f0("hunter95"))
    println("====================")

    //(1)、return 可以省略，Scala 会使用函数体的最后一行代码作为返回值
    def f1(name: String): String = {
      name
    }

    println(f1("hunter95"))
    println("====================")

    //(2)、如果函数体只有一行代码，可以省略花括号
    def f2(name: String): String = name

    println(f2("hunter95"))
    println("====================")

    //(3)、返回值类型如果能够推断出来，那么可以省略（:和返回值类型一起省略）
    def f3(name: String) = name

    println(f3("hunter95"))
    println("====================")

    //(4)、如果有 return，则不能省略返回值类型，必须指定
    def f4(name: String): String = { //String不能省略
      return name
    }

    println(f4("hunter95"))
    println("====================")

    //(5)、如果函数明确声明 unit，那么即使函数体中使用 return 关键字也不起作用
    def f5(name: String): Unit = {
      return name //return没有作用了
    }

    println(f5("hunter95"))
    println("====================")

    //(6)、Scala 如果期望是无返回值类型，可以省略等号
    def f6(name: String) {
      println(name)
    }

    println(f6("hunter95"))
    println("====================")

    //(7)、如果函数无参，但是声明了参数列表，那么调用时，小括号，可加可不加
    def f7(): Unit = {
      println("hunter95")
    }

    f7()
    f7
    println("====================")

    //(8)、如果函数没有参数列表，那么小括号可以省略，调用时小括号必须省略
    def f8: Unit = {
      println("hunter95")
    }

    //f8()    有小括号会报错
    f8
    println("====================")

    //(9)、如果不关心名称，只关心逻辑处理，那么函数名（def）可以省略

    //匿名函数,lambda表达式
    (name: String) => { println(name) }

  }
}
