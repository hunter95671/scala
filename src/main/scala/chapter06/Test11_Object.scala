package chapter06

object Test11_Object {

  def main(args: Array[String]): Unit = {

    //val student11 = new Student11("tom", 20)
    //student11.printInfo()

    val student1=Student11.newStudent("tom",20)
    student1.printInfo()

    val student2=Student11.apply("jerry",18)
    student2.printInfo()

    val student3=Student11("kent",21)
    student3.printInfo()

  }
}

//定义类
class Student11 private(val name: String, val age: Int) {

  def printInfo(): Unit = {
    println(s"student:name = ${name},age = ${age},school = ${Student11.school}")
  }
}

object Student11 {
  val school: String = "zjut"

  //定义一个类的对象实例的创建方法
  def newStudent(name:String,age:Int):Student11={
    new Student11(name,age)
  }

  def apply(name:String,age:Int):Student11={
    new Student11(name,age)
  }
}