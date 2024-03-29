package chapter06

object Test15_TraitOverlying {

  def main(args: Array[String]): Unit = {

    val student = new Student15
    student.increase()

    //钻石问题特质叠加
    val myFootBall = new MyFootBall
    println(myFootBall.describe())
  }
}

//定义球类
trait Ball {
  def describe(): String = "ball"
}

//定义颜色特质
trait ColorBall extends Ball {
  var color: String = "red"

  override def describe(): String = color + "-" + super.describe()
}

//定义种类特质
trait CategoryBall extends Ball {
  var category: String = "foot"

  override def describe(): String = category + "-" + super.describe()
}

//定义一个自定义球类
class MyFootBall extends CategoryBall with ColorBall {
  override def describe(): String = "my ball is " + super.describe()
}


//定义特质
trait Knowledge15 {
  var amount: Int = 0

  def increase(): Unit = {
    println("knowledge increase")
  }
}

trait Talent15 {
  def singing(): Unit

  def dancing(): Unit

  def increase(): Unit = {
    println("talent increase")
  }
}

class Student15 extends Person13 with Talent15 with Knowledge15 {
  override def singing(): Unit = {
    println("singing")
  }

  override def dancing(): Unit = {
    println("dancing")
  }

  override def increase(): Unit = super.increase()
}