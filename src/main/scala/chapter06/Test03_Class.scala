package chapter06

object Test03_Class {

  def main(args: Array[String]): Unit = {

    //创建一个对象
    val student=new Student()
    //student.name    不能访问私有属性
    println(student.age)
    println(student.sex)
    student.sex="female"
    println(student.sex)

  }
}

//定义一个类
class Student {
  //定义属性
  private var name: String = "tom"
  var age: Int = _
  var sex: String = _
}
