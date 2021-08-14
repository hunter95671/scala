package chapter06

object Test04_ClassForAccess {

}

//定义父类
class Person {
  private var idCard: String = "123456"
  protected var name: String = "tom"
  var sex: String = "female"
  private[chapter06] var age: Int = 18

  def printInfo(): Unit = {
    println(s"person:$idCard $name $sex $age")
  }
}
