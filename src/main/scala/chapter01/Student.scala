package chapter01

class Student (name: String,var age:Int){

  def printInfo():Unit={
    println(name+" "+age+" "+Student.school)
  }
}

//引入伴生对象
object Student{

  val school:String="ZJUT"

  def main(args: Array[String]): Unit = {
    val tom = new Student("Tom", 23)
    val jerry = new Student("Jerry", 22)

    tom.printInfo()
    jerry.printInfo()
  }
}
