package chapter06

object Test17_Extends {

  def main(args: Array[String]): Unit = {

    //1.类型检测与转换
    val student: Student17 = new Student17("tom", 18)
    student.study()
    student.sayHi()
    val person: Person17 = new Student17("jerry", 20)
    person.sayHi()

    //类型判断
    println("student is Student17:" + student.isInstanceOf[Student17])
    println("student is Person17:" + student.isInstanceOf[Person17])
    println("person is Person17:" + person.isInstanceOf[Person17])
    println("person is Student17:" + person.isInstanceOf[Student17])

    val person2: Person17 = new Person17("bob", 22)
    println("person2 is Person17:" + person2.isInstanceOf[Student17])

    //类型转换
    if (person.isInstanceOf[Student17]) {
      val newStudent = person.asInstanceOf[Student17]
      newStudent.study()
    }

    println(classOf[Student17])

    //测试枚举类
    println(WorkDay.MONDAY)
  }
}

class Person17(val name: String, val age: Int) {
  def sayHi() = {
    println("hi from person" + name)
  }
}

class Student17(name: String, age: Int) extends Person17(name, age) {
  override def sayHi() = {
    println("hi from student" + name)
  }

  def study(): Unit = {
    println("student study")
  }
}

//定义枚举类
object WorkDay extends Enumeration {
  val MONDAY = Value(1, "Monday")
  val TUESDAY = Value(2, "Tuesday")
}

//定义应用类对象
object TestApp extends App {
  println("app start")

  type MyString = String
  val a: MyString = "abc"
  println(a)
}