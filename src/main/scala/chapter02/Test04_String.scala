package chapter02

object Test04_String {

  def main(args: Array[String]): Unit = {
    //(1)、字符串，通过+号连接
    val name:String = "Tom"
    val age:Int = 20
    println(age + "岁的" + name + "在学习")

    // *号用于将一个字符串复制多次拼接
    println(name*3)

    //(2)、printf 用法：字符串，通过%传值。
    printf("%d岁的%s在学习",age,name)

    //(3)、字符串模板（插值字符串）：通过$获取变量值
    println(s"${age}岁的${name}在学习")

  }
}
