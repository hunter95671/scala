package chapter02

import chapter01.Student

object Test07_DataType {

  def main(args: Array[String]): Unit = {

    //1.整数类型
    val a1: Byte = 127
    //val a2:Byte = 128    超出范围，错误

    val a3 = 15 ///默认为Int
    val a4: Long = 123456789121212L //最后要加大写或者小写的 L

    val b1: Byte = 10
    val b2: Byte = (10 + 20) //可以运行
    println(b2)

    //val b3:Byte = (b1+20)     不能运行
    val b4: Byte = (b1 + 20).toByte
    println(b4)

    //2.浮点类型
    val f1 = 1.234 //默认为Double
    val f2: Float = 1.234f //float后要加f
    val f3: Double = 1.234

    //3.字符类型
    val c1: Char = 'a'
    val c2: Char = '9'

    //特殊字符
    val c3: Char = '\t' //制表符
    val c4: Char = '\n' //换行符

    //转义字符
    val c5: Char = '\\' //表示\自身
    val c6: Char = '\"' //表示"自身

    //字符变量底层保存ASCII码
    val i1: Int = c1
    println(i1) //97

    //4.布尔类型
    val isTrue: Boolean = true

    //5.空类型

    //5.1 空值 Unit

    def m1(): Unit = {
      println("m1调用")
    }

    val a = m1()
    println(a) //a的值为()

    //5.2 空引用
    //val n:Int = null     //值类型不能为null
    var student = new Student("tom", 18)
    student = null
    println(student)

    //5.3 Nothing
    def m2(n:Int):Nothing={
      throw new NullPointerException
    }

    val b = m2(0)
  }
}
