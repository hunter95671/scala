package chapter02

import chapter01.Student

object Test02_Variable {

  def main(args: Array[String]): Unit = {
    // 声明一个变量的通用语法
    var a: Int = 10

    //(1)、声明变量时，类型可以省略，编译器自动推导，即类型推导
    var a1 = 10
    val b1 = 20

    //(2)、类型确定后，就不能修改，说明 Scala 是强数据类型语言。
    var a2 = 15 //a2类型为int
    // a2 = "hello"  不可以

    //(3)、变量声明时，必须要有初始值
    //var a3:Int  不可以

    //(4)、在声明/定义一个变量时，可以使用 var 或者 val 来修饰，var 修饰的变量可改变
    a1 = 15
    //b1=25 常量值不能修改

    //val tom = new Student("Tom",21)  常量不能修改
    var tom = new Student("Tom", 21)
    tom = new Student("Jerry", 22)
    tom = null
    tom.age = 18 //class中age为var才能修改
  }
}
