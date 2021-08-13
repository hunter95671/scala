package object chapter06 {

  //定义当前包共享的属性和方法
  val commonValue="hunter"

  def commonMethod():Unit={
    println(s"${commonValue}在学习")
  }

}
