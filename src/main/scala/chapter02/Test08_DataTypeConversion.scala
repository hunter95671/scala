package chapter02

object Test08_DataTypeConversion {

  def main(args: Array[String]): Unit = {

    // 1.自动类型转换

    //(1)、自动提升原则：有多种类型的数据混合运算时,系统首先自动将所有数据转换成精度大的那种数据类型,然后再进行计算。
    val a1: Byte = 10
    val b1: Long = 2356
    val result1: Long = a1 + b1
    val result11: Int = (a1 + b1).toInt //强转

    //(2)、把精度大的数值类型赋值给精度小的数值类型时，就会报错，反之就会进行自动 类型转换。
    val a2: Byte = 10
    val b2: Int = a2

    //(3)、（byte，short）和 char 之间不会相互自动转换。
    val a3: Byte = 10
    val b3: Char = 'b'
    val c3: Byte = b3.toByte

    //(4)、byte，short，char 他们三者可以计算，在计算时首先转换为 int 类型。
    val a4: Byte = 12
    val b4: Short = 25
    val c4: Char = 'b'
    val result4: Int = a4 + b4 + c4

    //2.强制类型转换

    //(1)、将数据由高精度转换为低精度，就需要使用到强制转换
    val n1: Int = 2.5.toInt
    println(n1)

    //(2)、强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
    val n2:Int= (2.6+3.7).toInt
    println(n2)

    // 3.数值类型和string转换

    //(1)、数值转string
    val n:Int=27
    val s1:String =n+""
    val s2:String =n.toString
    println(s1)
    println(s2)

    //(2)、string转数值
    val m:Int="12".toInt
    val f:Float="12.3".toFloat
    val f2:Int ="12.3".toDouble.toInt
    println(f2)

  }
}
