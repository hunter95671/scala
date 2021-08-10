package chapter03

object Test01_Operator {

  def main(args: Array[String]): Unit = {

    //1.算数运算符

    //(1)、对于除号“/”，它的整数除和小数除是有区别的：整数之间做除法时只保留整数部分而舍弃小数部分。
    var r1: Int = 10 / 3 // 3
    println("r1=" + r1)
    var r2: Double = 10 / 3 // 3.0
    println("r2=" + r2)
    var r3: Double = 10.0 / 3 // 3.3333
    println("r3=" + r3)
    println("r3=" + r3.formatted("%.2f")) // 含义：保留小数点 2位，使用四舍五入

    //(2)、对一个数取模 a%b，和 Java 的取模规则一样。
    var r4 = 10 % 3 // 1
    println("r4=" + r4)

    //2.比较运算符
    val s1: String = "hello"
    val s2: String = new String("hello")
    println(s1 == s2) //true，判断内容，不判断引用
    println(s1.equals(s2)) //true，判断内容是否相同
    println(s1.eq(s2)) //false判断引用地址是否相同

    //3.逻辑运算符
    // 测试：&&、||、!
    var a = true
    var b = false
    println("a&&b=" + (a && b)) // a&&b=false
    println("a||b=" + (a || b)) // a||b=true
    println("!(a&&b)=" + (!(a && b))) // !(a&&b)=true

    //判断一个字符串是否为空

    def isNotEmpty(str: String): Boolean = {
      return str != null && !("".equals(str.trim))
    }

    //4.赋值运算符
    var n: Byte = 10
    //b = b + 1   不行，不能将int赋给byte
    var i: Int = 10
    i = i + 1
    i += 1
    //i = i++   没有++
    //i = i--   没有--

    //5.位运算符
    var n1: Int = 60
    println(n1 << 3) ///相当于乘以二的三次方
    println(n1 >> 2) ///相当于除以二的二次方

    //6.运算符本质
    val d1: Int = 12
    val d2: Int = 36
    println(d1.+(d2))
    println(d1 + d2)

  }
}
