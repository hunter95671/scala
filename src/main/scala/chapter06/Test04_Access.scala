package chapter06

object Test04_Access {

  def main(args: Array[String]): Unit = {
    //创建对象
    val person=new Person()
    //person.idCard   私有
    //person.name     保护
    println(person.age)
    println(person.sex)

    person.printInfo()

    val worker=new Worker()
    //worker=new Worker()
    worker.age=20
    worker.printInfo()
  }
}

//定义子类
class Worker extends Person{
  override def printInfo(): Unit = {
    //println(idCard)   父类私有
    name="jerry"
    sex="male"
    age=20
    println(s"Worker:$name $sex $age")
  }
}
