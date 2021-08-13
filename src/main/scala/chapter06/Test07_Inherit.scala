package chapter06

object Test07_Inherit {

  def main(args: Array[String]): Unit = {

    val student1=new Student7("tom",20)
    val student2=new Student7("jerry",18,"02")
    student1.printInfo()

    val teacher =new Teacher
    teacher.printInfo()

    def personInfo(person:Person7):Unit={
      person.printInfo()
    }
    personInfo(student1)

  }
}

//定义一个父类
class Person7() {
  var name: String = _
  var age: Int = _

  println("1.父类的主构造器调用")

  def this(name:String,age:Int){
    this()
    println("2.父类的辅助构造器调用")
    this.name=name
    this.age=age
  }

  def printInfo():Unit={
    println(s"Person:name = ${name},age = ${age}")
  }
}

//定义子类
class Student7(name:String,age:Int) extends Person7{

  var stuNo:String=_
  println("3.子类的主构造器调用")

  def this(name:String,age:Int,stuNo:String){
    this(name,age)
    println("4.子类的辅助构造器调用")
    this.stuNo=stuNo
  }

  override def printInfo(): Unit = {
    println(s"student:name = ${name},age = ${age},stdNo = ${stuNo}")
  }
}

class Teacher extends Person7{
  override def printInfo(): Unit = {
    println(s"teacher")
  }
}