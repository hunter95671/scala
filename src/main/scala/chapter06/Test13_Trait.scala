package chapter06

object Test13_Trait {

  def main(args: Array[String]): Unit = {

    val student = new Student13
    student.sayHello
    student.dating()
    student.play()
    student.study()

  }
}

//定义一个父类
class Person13 {
  val name: String = "person"
  var age: Int = 18

  def sayHello(): Unit = {
    println("hello from" + name)
  }
}

//定义一个特质
trait Young {
  //声明抽象和非抽象属性
  var age: Int
  val name: String = "young"

  def play(): Unit = {
    println(s"young people $name is playing")
  }

  def dating(): Unit
}

class Student13 extends Person13 with Young {

  //重写冲突的属性
  override val name: String = "student"

  //实现抽象方法
  def dating(): Unit = {
    println(s"student $name is dating")
  }

  def study(): Unit = {
    println(s"student $name is studying")
  }

  //重写父类方法
  override def sayHello: Unit = {
    super.sayHello()
    println("hello from student" + name)
  }
}
