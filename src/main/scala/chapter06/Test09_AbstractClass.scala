package chapter06

object Test09_AbstractClass {

  def main(args: Array[String]): Unit = {

    val student9 = new Student9
    student9.eat()
    student9.sleep()
  }
}

//定义抽象类
abstract class Person9 {

  //非抽象属性
  var name: String = "person"

  //抽象属性
  var age: Int

  //非抽象方法
  def eat(): Unit = {
    println("person eat")
  }

  //抽象方法
  def sleep(): Unit
}

//定义具体实现子类
class Student9 extends Person9 {
  var age: Int = 18

  def sleep(): Unit = {
    println("student sleep")
  }

  //重写非抽象属性和方法
  name = "student"

  override def eat(): Unit = {
    super.eat()
    println("student eat")
  }
}