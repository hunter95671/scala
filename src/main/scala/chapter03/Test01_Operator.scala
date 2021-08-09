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
    val s1:String = "hello"
    val s2:String =new String("hello")
    println(s1==s2)    //true，判断内容，不判断引用
    println(s1.equals(s2))  //true，判断内容是否相同
    println(s1.eq(s2))  //false判断引用地址是否相同

  }

}
