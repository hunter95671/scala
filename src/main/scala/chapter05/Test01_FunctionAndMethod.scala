package chapter05

object Test01_FunctionAndMethod {

  def main(args: Array[String]): Unit = {

    //定义函数
    def sayhi(name: String): Unit = {
      println("hi," + name)
    }

    //调用函数
    sayhi("tom")
    Test01_FunctionAndMethod.sayHi("jerry")

    //获取方法返回值
    val result = Test01_FunctionAndMethod.sayHello("kitty")
    println(result)
  }

  //定义对象的方法
  def sayHi(name: String): Unit = {
    println("Hi," + name)
  }

  def sayHello(name: String): String = {
    println("Hello," + name)
    return "hello"
  }

}
