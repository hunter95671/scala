package chapter05

object Test03_FunctionParameter {

  def main(args: Array[String]): Unit = {

    //(1)、可变参数
    def f1(str: String*): Unit = {
      println(str)
    }

    f1("aaa", "bbb", "ccc")

    //(2)、如果参数列表中存在多个参数，那么可变参数一般放置在最后

    def f2(str1: String, str2: String*): Unit = {
      println("str1:" + str1)
      println("str2:" + str2)
    }

    f2("tom", "aaa", "bbb", "ccc")

    //(3)、参数默认值，一般将有默认值的参数放置在参数列表的后面
    def f3(name: String = "hunter"): Unit = {
      println("hi," + name)
    }

    f3()
    f3("tom")

    //(4)、带名参数
    def f4(name: String = "hunter", age: Int): Unit = {
      println("欢迎" + age + "岁的" + name + "学习")
    }

    f4("tom", 20)
    f4(name = "jerry", age = 18)
    f4(age = 24)

  }
}
