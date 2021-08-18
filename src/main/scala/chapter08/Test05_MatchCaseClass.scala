package chapter08

object Test05_MatchCaseClass {

  def main(args: Array[String]): Unit = {
    val student1 = Student1("tom", 20)

    //针对对象实例内容进行匹配
    val result = student1 match {
      case Student1("tom", 20) => "tom 20"
      case _ => "else"
    }

    println(result)

  }
}

//定义样例类
case class Student1(name: String, age: Int)