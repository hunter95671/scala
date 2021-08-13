package chapter06

object Test06_ConstructorParams {

  def main(args: Array[String]): Unit = {
    val student2=new Student2
    student2.name="tom"
    student2.age=20
    println(s"student2:name = ${student2.name},age = ${student2.age}")

    val student3=new Student3("jerry",18)
    println(s"student2:name = ${student3.name},age = ${student3.age}")

    val student4=new Student4("kitty",16)
    student4.printInfo()

  }
}

//定义一个类
//无参构造器
class Student2 {
  //单独定义属性
  var name: String = _
  var age: Int = _
}

//上面定义等价于：
class Student3(var name: String,var age: Int){

}

//主构造器参数无修饰
class Student4(name: String,age: Int){

  def printInfo():Unit={
    println(s"student4:name = ${name},age = ${age}")
  }

}